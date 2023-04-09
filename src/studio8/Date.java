package studio8;

import java.util.Objects;
import java.util.*;

public class Date {

private int month;

private int day;

private int year;

private boolean isHoliday;


	
	
    public static void main(String[] args) {
    	
    	LinkedList<Date> list = new LinkedList<Date>();
    	
    	
    	Date d1 = new Date (12, 4, 2003, true);
    	Date d2 = new Date (1, 14, 2004, true);
    	Date d3 = new Date (3, 26, 2004, true);
    	Date d4 = new Date (6, 4 , 1973, true);
    	Date d5 = new Date (4, 6, 2023, false );
    	list.add(d1);
    	list.add(d2);
    	list.add(d3);
    	list.add(d4);
    	list.add(d5);
    	System.out.println(list);
    	
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(d1);
    	set.add(d2);
    	set.add(d3);
    	set.add(d4);
    	set.add(d5);
    	System.out.println(set);
    }

   
    public Date ( int month, int day, int year,boolean isHoliday ) {
    	this.month = month;
    	this.day = day;
    	this.year = year;
    	this.isHoliday = isHoliday;
    
    }
    
    
    
    
    
    
    public String toString() {
    	
    	
    	return this.month + "/" + this.day + "/" + this.year + "  Today is a holiday: " + this.isHoliday + "\n";
    	
    

    }


	@Override
	public int hashCode() {
		return Objects.hash(day, isHoliday, month, year);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && isHoliday == other.isHoliday && month == other.month && year == other.year;
	}
    
   
    
    
    
    
    
    }
    
    
    

    	
    	
    	

    
    
    

