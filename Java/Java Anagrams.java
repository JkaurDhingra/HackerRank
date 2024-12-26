import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        // Convert both strings to lowercase and convert them to character arrays
        char arr[] = a.toLowerCase().toCharArray();
        char brr[] = b.toLowerCase().toCharArray();
        
        // Sort both character arrays
        java.util.Arrays.sort(arr);
        java.util.Arrays.sort(brr);
        
        if(arr.length != brr.length) return false; // Lengths not equal -> Not Anagrams
        
        // Compare the characters in both sorted arrays
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != brr[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
