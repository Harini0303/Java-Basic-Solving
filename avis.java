import java.util.*;
import java.io.*;

class Avis {
    public static void main ( String args[]) {
        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt() , r = n % 9 , q = n / 9;
        for (int i = 1 ; i <= q ; i++ , r = (r * 10) + 9);
        System.out.println(r);
    }
}