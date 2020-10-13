/* package codechef; // don't place package name! */

// Book's Solution

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) {
        System.out.println(isCharUnique(""));
    }
    
    static boolean isCharUnique(String str) {
        if (str.length()>128) return false;
        
        boolean[] charSet = new boolean[128];
        
        for (int i=0;i<str.length();i++) {
            int val = str.charAt(i);
            if(charSet[val]) {
                return false;
            }
            else {
                charSet[val] = true;
            }
        }
        return true;
     
    }

}
