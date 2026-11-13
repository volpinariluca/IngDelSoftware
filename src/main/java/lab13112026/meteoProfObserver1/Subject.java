package lab13112026.meteoProfObserver1;

public interface Subject {
    public void RegisterSubject(Observer o);
    public void RemoveObserver(Observer o);
    public void notifyObserver(Observer o);
}
