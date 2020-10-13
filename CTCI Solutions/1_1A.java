/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean flag = true;
		for (int i=0;i<str.length();i++) {
		    for (int j=i+1;j<str.length()-i;j++) {
		        if (str.charAt(i) == str.charAt(j)) {
		            flag = false;
		            break;
		        }
		        else {
		            continue;

		        }
		    }
		}
		System.out.println(flag);

	}
}
