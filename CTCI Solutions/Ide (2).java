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
		System.out.println(isAnargram("Abc","cab"));
	}
	
	static String sort(String str) {
	    char[] arr = str.toCharArray();
	    java.util.Arrays.sort(arr);
	    return new String(arr);
	}
	
	static boolean isAnargram(String str1, String str2) {
	    str1 = str1.toLowerCase();
	    str2 = str2.toLowerCase();
	    if (str1.length() != str2.length()) return false;
	    
	    return sort(str1).equals(sort(str2));
	}
}
