import java.util.*;
import java.io.*;
import java.lang.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int A = a + b;
            for (int j = 1; j <= n; j++){
                System.out.print(A + " ");
                A += Math.pow(2,j) * b;
            }
            System.out.println();
        }
        in.close();
    }
}
