import java.io.*;
import java.util.*;

class Square {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++, System.out.println()) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i + j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
        }
    }
}
