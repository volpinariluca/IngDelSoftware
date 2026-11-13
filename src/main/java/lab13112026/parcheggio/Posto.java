package lab13112026.parcheggio;

public class Posto	 extends Parcheggio {
    String number;
    String size;
    boolean free;

    
    public Posto(String number, 
                    String size, 
                    boolean free) 
    {   this.number = number;
        this.size = size;
        this.free = free;
    }
  
    public String getNumber() {
        return number;
    }
  
    public String getSize() {
        return size;
    }

  public boolean isFree() {
        return free;
    }

    public void print() {
        
        if (isFree()) {
        	System.out.print("  " + getNumber());
            System.out.print(", " + getSize());
            System.out.println("(free)");
        }
        //System.out.println("\n");
    }
    
    
}

