package lab13112026.meteoProf;

public class DemoStazione {
	public static void main(String[] Args) {
		StazioneMeteo stazione = new StazioneMeteo();
		for(int i = 0; i< 10; i++)
			stazione.previsione();
	}
}
