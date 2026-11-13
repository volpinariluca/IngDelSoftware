package lab13112026.meteo;

public class SoftwareMeteo implements Forecast{
    Forecast  Soleggiato;
    Forecast Nuvoloso;
    Forecast Piovigginoso;
    Forecast forecast;

    public SoftwareMeteo(Forecast soleggiato, Forecast nuvoloso, Forecast piovigginoso, Forecast forecast) {
        Soleggiato = soleggiato;
        Nuvoloso = nuvoloso;
        Piovigginoso = piovigginoso;
        this.forecast = forecast;
    }

    void setForecast(Forecast forecast){
        this.forecast = forecast;
    }

    public void isSoleggiato(){
        forecast.isSoleggiato();
    }

    public void isNuvoloso(){
        forecast.isNuvoloso();
    }

    public void isPiovigginoso(){
        forecast.isPiovigginoso();
    }

}
