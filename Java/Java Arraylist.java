import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Initialize an ArrayList of ArrayLists to store the elements
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();  
        for(int i = 0; i < n; i++){
            list.add(new ArrayList<Integer>());
        }
        
        // Read the data for each array and add the integers to the corresponding ArrayList
        for(int i = 0; i < n; i++){
            int d = sc.nextInt();
            for(int j = 0; j < d; j++){
                list.get(i).add(sc.nextInt());
            }
        }
        
        // Process each query by reading the indices (x, y)
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            // Check if the requested element exists in the list
            if(y - 1 < list.get(x - 1).size()){
                System.out.println(list.get(x-1).get(y - 1));
            }
            else{
                System.out.println("ERROR!");
            }
        }
        sc.close();
        
    }
}
