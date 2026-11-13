package lab13112026.meteoProfObserver2;
public class NotificaTestuale implements StrategiaNotifica {
    @Override
    public String creaMessaggio(State stato) {
        return "Il tempo e' cambiato: " + stato;
    }
}
