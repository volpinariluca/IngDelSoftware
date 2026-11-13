package lab13112026.parcheggio;

public class ParcheggioItem extends ParcheggioComponent{
    String nome;
    String descrizione;

    public ParcheggioItem(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public void print() {
        System.out.println( "ParcheggioItem{" +
                "nome='" + nome + '\'' +
                ", descrizione='" + descrizione + '\'' +
                '}'
        );
    }
}
