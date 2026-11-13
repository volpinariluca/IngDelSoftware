package lab13112026.meteoProfObserver2;
// La rappresentazione visiva resta separata dalle transizioni meteorologiche.
public class SimboliMeteo {
    public static String per(State stato) {
        if (stato instanceof Soleggiato) return "\\o/";
        if (stato instanceof Nuvoloso) return "(~ ~)";
        if (stato instanceof Piovigginoso) return "///";
        return "?";
    }
}
