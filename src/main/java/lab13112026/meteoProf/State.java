package lab13112026.meteoProf;

public interface State {
	public void previsione(int dati);
	public String toString();
	public void peggiora();
	public void migliora();
}
