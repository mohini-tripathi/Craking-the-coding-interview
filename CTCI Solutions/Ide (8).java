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
		System.out.println(oneAway("pale","palaa"));
	}
	
	static int i;
	
	static boolean oneAway(String first, String second) {
	    
	    if (first.length() == second.length()) {
	        return oneReplace(first,second);
	    }
	    
	    else if (first.length() == second.length() - 1) {
	        return oneInsert(first,second);
	    }
	    
	    else if (first.length() == second.length() + 1) {
	        return oneInsert(second,first);
	    }
	    
	    return false;

	}
	
	static boolean oneInsert(String s1, String s2) {
	    int j=0;
	    int i=0;
	    while (i<s1.length() && j<s2.length()) {
	        if (s1.charAt(i) != s2.charAt(j)) {
	            if(i != j) {
	                return false;
	            }
	            j++;
	        }
	        else {
	            i++;
	            j++;
	        }
	    }
	    return true;
	}
	
	static boolean oneReplace(String s1, String s2) {
	    for (i=0;i<s1.length();i++) {
	        if(s1.charAt(i) != s2.charAt(i)) {
	            s1 = s1.substring(0,i)+s2.charAt(i)+s1.substring(i+1);
	            break;
	        }
	    }
	    return s1.equals(s2);

	}
}
