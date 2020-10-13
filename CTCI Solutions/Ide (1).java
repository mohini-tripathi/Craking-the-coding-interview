import java.util.Scanner;

 class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean success = false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        StringBuilder build = new StringBuilder(b);

        if(a.length() != b.length()) {
            return success;
        }
        else {
            for (int i=0; i<a.length(); i++) {
                for (int j=0; j<b.length(); j++) {
                if(a.charAt(i) == b.charAt(j)) {
                    success = true;
                    build.deleteCharAt(j);
                    b = build.toString();
                    break;
                }
                else {
                    success = false;
                }
            }
        }  
    }
    return success;
}

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println(ret);
    }
}
