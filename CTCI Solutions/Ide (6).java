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
		System.out.println(palindrome("ab  abc"));
	}
	
	static boolean palindrome(String str) {
	    int count=0,i;
	    boolean flag = false;
	    int[] array = new int[106];
	    char[] strArray = str.toCharArray();
	    StringBuilder build = new StringBuilder(str);
	    for (char c: strArray) {
	        array[c]++;
	    }
	    
	    if (str.length() % 2 == 0) {
	        for (i=0;i<str.length();i++) {
	            int c = (int) str.charAt(i);
	            if (array[c] == 2)  {
	                flag = true;
	            }
	            else {
	                flag = false;
	            }
	        }
	        
	    }
	    else if (str.length() % 2 == 1) {
	        for(i=0;i<str.length();i++) {
	            int c = (int) str.charAt(i);
	            if (array[c] == 1) {
	                count++;
	                build.deleteCharAt(i);
	            }
	        }
	        if (count == 1) {
	            for(i=0;i<str.length()-1;i++) {
	            int c = (int) str.charAt(i);
	            if(array[c] == 2) {
	                flag = true;
	                }
	                else {
	                    flag = false;
	                }
	            }
	        }
	        else {
	            return false;
	        }
	    }
	    return flag;
	}
}
