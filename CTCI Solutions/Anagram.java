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
		System.out.println(isAnagram("@bcaa", "bcaaa"));
	}
	
	static boolean isAnagram(String str1, String str2) {
	    if (str1.length() != str2.length()) return false;
	    
	    int[] letters = new int[128];
	    char[] str1Array = str1.toCharArray();
	    
	    for(char c: str1Array) {
	        letters[c]++;
	    }
	    for(int i=0; i<str1.length();i++) {
	        int a = (int) str2.charAt(i);
	        letters[a]--;
	        if(letters[a]<0) {
	            return false;
	        }
	    }
	    return true;
	    
	}
}
