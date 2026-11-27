package lab27112026.altoparlante;

public class PulsanteSonoro extends Pulsante{
    private Command comando;
    public PulsanteSonoro(Command comando)
    {
        super(comando);
    }

    public void premi() {
        comando.execute();
        System.out.println("BIP");
    }
}
