package lab13112026.meteoProf;
import java.util.*;

public class StazioneMeteo {
	private State nuvoloso;
	private State piovigginoso;
	private State soleggiato;
	private State nevoso;
	private State stato;
	private Random rand = new Random(System.currentTimeMillis());
	//Rappresenta i dati che la stazione rileva e che invia allo stato che si occupa di elaborarli
	
	public StazioneMeteo() {
		nuvoloso = new Nuvoloso(this);
		piovigginoso = new Piovigginoso(this);
		soleggiato = new Soleggiato(this);
		nevoso = new Nevoso(this);
		setState(piovigginoso); //previsione iniziale, sono pessimista
	}
	
	public void previsione() {
		int dati = rand.nextInt(10); //mando un numero tra 0 e 9 --> 10 numeri possibili
		stato.previsione(dati);
		System.out.println(stato.toString());
	}
	
	//getter & setter
	public void setState(State stato) {
		this.stato = stato;
	}
	
	public State getNuvolosoState() { return nuvoloso; }
	public State getSoleggiatoState() { return soleggiato; }
	public State getPiovigginosoState() { return piovigginoso; }
	public State getNevosoState() { return nevoso; }
}
