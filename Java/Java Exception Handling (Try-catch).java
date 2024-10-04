import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        try{
            int x = scan.nextInt();
            int y = scan.nextInt();
            int data = x / y;
            System.out.println(data);
        }
        catch(ArithmeticException e1){
            System.out.println(e1);
        }
        catch(InputMismatchException e2){
            System.out.println(e2.getClass().getName());
        }
        finally{
            scan.close();
        }   
    }
}
