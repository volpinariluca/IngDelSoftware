package lab13112026.meteoProfObserver2;
public interface State {
	public void previsione(int dati);
	public String toString();
	public void peggiora();
	public void migliora();
}
