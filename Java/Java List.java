import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        // Read input and populate the list
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> L = new ArrayList<>(N);
        for(int i = 0; i < N; i++){
            L.add(sc.nextInt());
        }
        
        // Process each query
        int Q = sc.nextInt();
        for(int i = 0; i < Q; i++){
            String query = sc.next();
            if(query.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                L.add(x,y);
            }
            else{
                int x = sc.nextInt();
                L.remove(x);
            }
        }
        
        // Print the final state of the list
        for(int i = 0; i < L.size(); i++){
            System.out.print(L.get(i) + " ");
        }
        sc.close();
    }
}
