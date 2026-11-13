package lab13112026.meteoProfObserver2;

public class DemoStazione {
    public static void main(String[] args) {
        StazioneMeteo stazione = new StazioneMeteo();
        Utente anna = new Utente("Anna", new NotificaTestuale());
        Utente luca = new Utente("Luca", new NotificaVisiva());
        stazione.registraOsservatore(anna);
        stazione.registraOsservatore(luca);

        // Passaggi espliciti per mostrare tutte le funzionalita'.
        System.out.println("--- Due utenti, strategie diverse ---");
        stazione.setState(stazione.getNuvolosoState());
        System.out.println("--- Stesso stato: nessuna notifica ---");
        stazione.setState(stazione.getNuvolosoState());
        System.out.println("--- Anna passa alla strategia visiva ---");
        anna.setStrategia(new NotificaVisiva());
        stazione.setState(stazione.getSoleggiatoState());
        System.out.println("--- Luca si disiscrive ---");
        stazione.rimuoviOsservatore(luca);
        stazione.setState(stazione.getNuvolosoState());

        System.out.println("--- Dieci previsioni casuali ---");
        for (int i = 0; i < 10; i++) stazione.previsione();
    }
}
