import java.util.*;
import java.io.*;

class TriangleOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n ; i++ , System.out.println()){
            for ( int j = 0 ; j <= i*2 ; j++){
                System.out.print("*");
            }
             
        }
    }
}