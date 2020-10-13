/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		System.out.println(oneAway("pales","pale"));
	}
	
	static boolean oneAway(String first, String second) {
	    int i;

	    if (first.length() == second.length()) {
	        for (i=0;i<first.length();i++) {
	            if (first.charAt(i) != second.charAt(i)) {
	             first = first.substring(0,i)+second.charAt(i)+first.substring(i+1);
	             break;
	                
	            }
	        }
	    }
	    
	    else if (first.length() == second.length()+1) {
	        try {
	        for (i=0;i<first.length();i++) {
	            if (first.charAt(i) != second.charAt(i)) {
	                first = first.substring(0,i)+first.substring(i+1);
	                break;
	            }
	            
	        }	            
	        }
	        catch(Exception e) {
	            System.out.println("error");
	        }


	    }
	    
	    else if (first.length() == second.length()-1) {
	        for (i=0;i<first.length();i++) {
	            if (second.charAt(i) != first.charAt(i)) {
	                second = second.substring(0,i)+second.substring(i+1);
	                break;
	            }
	            
	        }	        
	    }
	    
	    else {
	        return false;
	    }
	    
	    return first.equals(second);
	}
	
}
