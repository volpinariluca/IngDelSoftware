package lab13112026.meteoProfObserver1;

public class DemoStazione {
	public static void main(String[] Args) {
		StazioneMeteo stazione = new StazioneMeteo();
		for(int i = 0; i< 10; i++)
			stazione.previsione();
	}
}
