package lab13112026.meteoProf;

public class Nuvoloso implements State{
	private StazioneMeteo stazione;
	
	public Nuvoloso(StazioneMeteo stazione) {
		this.stazione = stazione;
	}

	@Override
	public void previsione(int dati) {

		if(dati <1)
			this.peggioraMolto();
		if(dati <3) // 30% soleggiato
			this.migliora();
		else if(dati <8) 
			this.peggiora(); //50% va in piovigginoso
	}
	
	@Override
	public void migliora() {
		stazione.setState(stazione.getSoleggiatoState());
	}
	

	public void peggiora() {
		stazione.setState(stazione.getNevosoState());
	}

	public void peggioraMolto(){
		stazione.setState(stazione.getNevosoState());
	}

	@Override
	public String toString() {
		return "Previsto Nuvoloso";
	}
}
