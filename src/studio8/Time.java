package studio8;

import java.util.LinkedList;
import java.util.Objects;
import java.util.*;

public class Time {

	private int hour;

	private int minute;

	private boolean isTwent;
		
	
	
	
	public static void main(String[] args) {
		
		LinkedList<Time> list = new LinkedList<Time>();
    	
    	
    	Time d1 = new Time (23, 43, true);
    	Time d2 = new Time (11, 14, true);
    	Time d3 = new Time (17, 26, false);
    	list.add(d1);
    	list.add(d2);
    	list.add(d3);
    	System.out.println(list);
    	
    	HashSet<Time> set = new HashSet<Time>();
    	set.add(d1);
    	set.add(d2);
    	set.add(d1);
    	System.out.println(set);
    	
    	
    }

	
	 public Time( int hour, int minute, boolean isTwent) {
	    	
	    	this.hour = hour; 
	    	this.minute = minute;
	    	this.isTwent = isTwent;
	    	
	    }
	 
	 
	
	 @Override
	public int hashCode() {
		return Objects.hash(hour, isTwent, minute);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && isTwent == other.isTwent && minute == other.minute;
	}


	public String toString() {
	        if (isTwent == true) {
	        	return hour + ":" + minute;
	        
	        } else if (hour > 12 && isTwent == false) {
	        	
	        	return hour-12 + ":" + minute;	      
	        	
	        } else if (hour <= 12 && isTwent == false) {
	        	
	        	return hour + ":" + minute;

	        }
	        return "";
	      
	        
	        }
}