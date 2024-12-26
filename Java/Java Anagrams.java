import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function

        // Convert both strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        // Use a frequency array to track letter counts, incrementing for string 'a' and decrementing for string 'b'
        int freq[] = new int[26];
        for(int i = 0; i < a.length(); i++){
            freq[a.charAt(i) - 'a']++;
        }
        for(int i = 0; i < b.length(); i++){
            freq[b.charAt(i) - 'a']--;
        }

        // Check if all frequencies are zero; if any non-zero value is found, return false (not anagrams)
        for(int i = 0; i < 26; i++){
            if(freq[i] != 0) return false;
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
