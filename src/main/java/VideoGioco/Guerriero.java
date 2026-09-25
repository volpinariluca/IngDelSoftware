package VideoGioco;

public class Guerriero extends Player{

    public Guerriero(){
        fightbehaviour = new LaserGunBehaviour();
        driveBehaviour = new InterstellarShipBehaviour();
    }
}
