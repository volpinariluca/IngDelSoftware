package lab27112026.campanello;
import java.lang.reflect.*;

public class Campanello implements CampanelloInterface{

    private boolean isOpen = false;
    private int numOpen = 0;

    public void ring(){
        System.out.println("\nring!!!");
        numOpen++;
    }

    public void openDoor(){
        System.out.println("\nDoor Opened!");
    }

    private boolean isOpen(){
        return isOpen;
    }

    private int getNumOpen(){
        return numOpen;
    }

    public void getStatus() {
        if (isOpen()) {
            System.out.println("La porta è APERTA, ed è stata aperta " + getNumOpen() + "volte");
        } else {
            System.out.println("La porta è CHIUSA, ed è stata aperta " + getNumOpen() + "volte");
        }
    }

}
