package lab13112026.parcheggio;
import java.util.ArrayList;
import java.util.Iterator;

public class Area extends Parcheggio {
    ArrayList<Parcheggio> parcheggioComponents = new ArrayList<Parcheggio>();
    String name;
    String description;
    public Area(String name, String description) {
        this.name = name;
        this.description = description;    }

    public void add(Parcheggio parcheggio) {
    	parcheggioComponents.add(parcheggio);    }

    public void remove(Parcheggio parcheggio) {
    	parcheggioComponents.remove(parcheggio);
    }

    public Parcheggio getChild(Integer i) {
        return parcheggioComponents.get(i);    }

    public String getName() {
        return name;    }

    public String getDescription() {
        return description;
    }
    
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");
  
        Iterator<Parcheggio> iterator = parcheggioComponents.iterator();
        while (iterator.hasNext()) {
        	Parcheggio parcheggio = iterator.next();
        	parcheggio.print();
        }
    }

}