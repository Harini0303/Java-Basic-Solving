import java.util.*;
import java.io.*;

class OddStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
            for(int k =  n - i ; k > 0 ; k-- , System.out.println()){
                for(int j = 0 ; j <= i * 2 ; j++){
                System.out.print("*");
            }
            }
        }
    }
}