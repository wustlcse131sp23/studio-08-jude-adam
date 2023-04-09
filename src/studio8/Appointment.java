package studio8;

import java.util.LinkedList;

public class Appointment {
	
	
	private Date d1;
	private Time t1;
	
	
	

	public static void main(String[] args) {
		

LinkedList<Date> list = new LinkedList<Date>();
    	
    	
    	Date d1 = new Date (12, 4, 2003, true);
    	Date d2 = new Date (1, 14, 2004, true);
    	Date d3 = new Date (3, 26, 2004, true);
    	Date d4 = new Date (6, 4 , 1973, true);
    	Date d5 = new Date (4, 6, 2023, false );
		
    	Time t1 = new Time (23, 43, true);
    	Time t2 = new Time (11, 14, true);
    	Time t3 = new Time (17, 26, false);
		
		
    	Appointment a1 = new Appointment (d1, t1);
    	Appointment a2 = new Appointment (d2, t2);
    	Appointment a3 = new Appointment (d3, t3);
    	
    	System.out.println(a1);
    	
    	
	}
	
	public Appointment (Date d, Time t) {
		
		this.d1 = d;
		this.t1 = t;
		
		
		
		
	}
	
		public String toString() {
			return this.d1 + " " + this.t1; 
			
			
			
		}
	
	
}
