import java.io.*;
import java.util.*;

class Symbol {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++,System.out.println()){ //outer loop row
            for(int j = 0;j<n; j++){  //innerloop col
                if( i==n/2 || j==n/2 ||  //mid part
                    i==0 && j>n/2 || j==0 && i<n/2 ||  //frst row or frst col
                    i==n-1 && j<n/2 || j==n-1 && i>n/2)  //last row or last col
                System.out.print("*");
                else
                System.out.print(" ");

            }
        }
    }
}