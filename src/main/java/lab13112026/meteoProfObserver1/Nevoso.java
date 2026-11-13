package lab13112026.meteoProfObserver1;

public class Nevoso implements State {
    private StazioneMeteo stazione;

    public Nevoso(StazioneMeteo stazione) {
        this.stazione = stazione;
    }


    public void previsione(int dati) {

        if(dati <3) // 30% soleggiato
            this.migliora();
        else if(dati <8)
            this.peggiora(); //50% va in piovigginoso
    }


    public void migliora() {
        stazione.setState(stazione.getPiovigginosoState());
    }


    public void peggiora() {
        //nulla, non può peggiorare
    }


    public String toString() {
        return "Previsto Nuvoloso";
    }
}
