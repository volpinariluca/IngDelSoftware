package lab13112026.meteoProfObserver2;
public class Nuvoloso implements State{
	private StazioneMeteo stazione;
	
	public Nuvoloso(StazioneMeteo stazione) {
		this.stazione = stazione;
	}

	@Override
	public void previsione(int dati) {

		if(dati <3) // 30% soleggiato
			this.migliora();
		else if(dati <8) 
			this.peggiora(); //50% va in piovigginoso
	}
	
	@Override
	public void migliora() {
		stazione.setState(stazione.getSoleggiatoState());
	}
	
	@Override
	public void peggiora() {
		stazione.setState(stazione.getPiovigginosoState());
	}

	@Override
	public String toString() {
		return "Previsto Nuvoloso";
	}
}
