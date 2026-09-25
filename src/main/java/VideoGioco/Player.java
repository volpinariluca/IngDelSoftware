package VideoGioco;

public abstract class Player{
    protected int lifePoints = 10;
    FightBehaviour fightbehaviour;
    DriveBehaviour driveBehaviour;


    public Player() {
    }

    public void performFight(){
        fightbehaviour.fight();
    }

    public void performDrive(){
        driveBehaviour.drive();
    }

}


