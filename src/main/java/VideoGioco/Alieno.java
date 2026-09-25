package VideoGioco;

public class Alieno extends Player{
    public Alieno(){
        fightbehaviour = new VenomousBlobBehaviour();
        driveBehaviour = new TeleportBehaviour();
    }
}
