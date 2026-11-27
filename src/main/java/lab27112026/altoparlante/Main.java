package lab27112026.altoparlante;

public class Main {
    public static void main(String[] args) {
        Altoparlante altoparlante = new Altoparlante();
        Command annuncio = new AnnuncioCommand(altoparlante, "La lezione sta iniziando");
        Pulsante pulsante = new Pulsante(annuncio);
        pulsante.premi();
    }
}
