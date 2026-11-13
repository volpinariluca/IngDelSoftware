package lab13112026.parcheggio;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parcheggio myParking = 
	            new Area("Francesco's Parking", "The best parking");

		Parcheggio area1 = 
	            new Area("Area 1", "Deluxe");
		Parcheggio area2 = 
	            new Area("Area 2", "Dirty");
		
		Parcheggio area3 = 
	            new Area("Area 3", "For bikes only");

		Parcheggio area11 = 
	            new Area("Area 1.1", "descr: Area 1.1");
		Parcheggio area12 = 
	            new Area("Area 1.2", "descr: Area 1.2");
		
		
		myParking.add(area1);
		//myParking.add(new Posto("1","15",true));
		//myParking.add(area2);
		myParking.add(area3);
	    
	    area1.add(area11);
	    
		area1.add(area12);
		area1.add(area2);
			
		
		
		
		
		area11.add(new Posto("2","25",false));
		area11.add(new Posto("3","35",true));
		area12.add(new Posto("1","51",false));
		area12.add(new Posto("2","52",true));
			
		myParking.print();
		
		


	}

}
