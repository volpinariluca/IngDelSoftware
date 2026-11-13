package lab13112026.meteoProfObserver2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class StazioneMeteo {
    private State nuvoloso;
    private State piovigginoso;
    private State soleggiato;
    private State stato;
    private Random rand = new Random();
    private List<Osservatore> osservatori = new ArrayList<>();

    public StazioneMeteo() {
        nuvoloso = new Nuvoloso(this);
        piovigginoso = new Piovigginoso(this);
        soleggiato = new Soleggiato(this);
        stato = piovigginoso; // previsione iniziale, sono pessimista
    }

    public void previsione() {
        int dati = rand.nextInt(10);
        stato.previsione(dati);
        // La stampa e' affidata agli osservatori, solo se cambia lo stato.
    }

    public void registraOsservatore(Osservatore osservatore) {
        Objects.requireNonNull(osservatore);
        if (!osservatori.contains(osservatore)) {
            osservatori.add(osservatore);
        }
    }

    public void rimuoviOsservatore(Osservatore osservatore) {
        osservatori.remove(osservatore);
    }

    public void setState(State nuovoStato) {
        Objects.requireNonNull(nuovoStato);
        // La stazione riutilizza sempre le stesse istanze dei tre stati.
        if (stato != nuovoStato) {
            stato = nuovoStato;
            for (Osservatore osservatore : new ArrayList<>(osservatori)) {
                osservatore.aggiorna(nuovoStato);
            }
        }
    }

    public State getState() { return stato; }
    public State getNuvolosoState() { return nuvoloso; }
    public State getSoleggiatoState() { return soleggiato; }
    public State getPiovigginosoState() { return piovigginoso; }
}
