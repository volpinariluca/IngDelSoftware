package lab13112026.meteoProfObserver2;

import java.util.Objects;

public class Utente implements Osservatore {
    private String nome;
    private StrategiaNotifica strategia;

    public Utente(String nome, StrategiaNotifica strategia) {
        this.nome = nome;
        setStrategia(strategia);
    }

    public void setStrategia(StrategiaNotifica strategia) {
        this.strategia = Objects.requireNonNull(strategia);
    }

    @Override
    public void aggiorna(State stato) {
        System.out.println(nome + ": " + strategia.creaMessaggio(stato));
    }
}
