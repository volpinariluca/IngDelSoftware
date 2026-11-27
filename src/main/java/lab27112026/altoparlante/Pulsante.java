package lab27112026.altoparlante;

public abstract class Pulsante {
    private Command comando;
    public Pulsante(Command comando) { this.comando = comando; }
    public void setComando(Command comando) { this.comando = comando; }
    public void premi() { comando.execute(); }
}
