package lab27112026.altoparlante;

public abstract class PulsanteSilent {
    private Command comando;
    public PulsanteSilent(Command comando) { this.comando = comando; }
    public void setComando(Command comando) { this.comando = comando; }
    public void premi() { comando.execute(); }
}
