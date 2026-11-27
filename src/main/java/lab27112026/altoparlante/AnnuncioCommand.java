package lab27112026.altoparlante;

public class AnnuncioCommand {
    private final Altoparlante altoparlante;
    private final String messaggio;
    public AnnuncioCommand(Altoparlante a, String m) {
        altoparlante = a;
        messaggio = m;
    }
    public void execute() {
        altoparlante.riproduci(messaggio);
    }

}
