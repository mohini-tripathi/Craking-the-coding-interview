/* package codechef; // don't place package name! */

// O(n)

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
	
		int i = 0;
		while(i<str.length()) {
		    map.put(i,str.charAt(i));
		    i++;
		}
		
		Set valueSet = new HashSet(map.values());
		
		if(map.keySet().size() != valueSet.size()) {
		    System.out.println("false");
		}
		else {
		    System.out.println("true");
		}
	}
}
