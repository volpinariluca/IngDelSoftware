package lab13112026.meteoProfObserver2;
public class NotificaVisiva implements StrategiaNotifica {
    @Override
    public String creaMessaggio(State stato) {
        return SimboliMeteo.per(stato);
    }
}
