package lab13112026.meteoProfObserver2;
public class Piovigginoso implements State{
	private StazioneMeteo stazione;
	
	public Piovigginoso(StazioneMeteo stazione) {
		this.stazione = stazione;
	}

	@Override
	public void previsione(int dati) {
		if(dati < 8) //8 numeri su 10 --> 80% Migliora
			this.migliora();
		else
			this.peggiora(); // 20%: rimane piovigginoso
	}
	
	@Override
	public void migliora() {
		stazione.setState(stazione.getNuvolosoState());
	}
	
	@Override
	public void peggiora() {
		// Non fa nulla
	}
	
	@Override
	public String toString() {
		return "Previsto Piovigginoso";
	}
}
