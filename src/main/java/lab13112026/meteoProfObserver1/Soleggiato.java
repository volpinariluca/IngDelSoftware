package lab13112026.meteoProfObserver1;

public class Soleggiato implements State {
	private StazioneMeteo stazione;
	
	public Soleggiato(StazioneMeteo stazione) {
		this.stazione = stazione;
	}

	@Override
	public void previsione(int dati) {
		if(dati <5) //50% nuvoloso
			this.migliora();
		else
			this.peggiora(); //un solo numero --> 10% piove 
	}
	
	@Override
	public void migliora() {
		// non fa nulla, può solo peggiorare
	}
	
	@Override
	public void peggiora() {
		stazione.setState(stazione.getNuvolosoState());
	}
	
	@Override
	public String toString() {
		return "Previsto Soleggiato";
	}

}
