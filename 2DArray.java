import java.util.Scanner;
import java.util.Arrays;

//TWO PRINT 2D
// class TwoDArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt(), a [] [] = new int [n] [n];
//         for(int i = 0; i < n ; i++)
//                 for(int j = 0 ; j < n ; a [i] [j++] = sc.nextInt());
                
//                     for(int i = 0; i < n ; i++, System.out.println())
//                      for(int j = 0 ; j < n ; System.out.print(a [i] [j++]+" "));
//         }
// }


//SUM OF DIAGONALS
// class TwoDArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt(), a [] [] = new int [n] [n] , sum = 0;
//         for(int i = 0; i < n ; i++)
//                 for(int j = 0 ; j < n ; a [i] [j++] = sc.nextInt());
                
//         for(int i = 0; i < n ; i++)
//             for(int j = 0 ; j < n ; j++)
//             if (i == j || i + j == n - 1) sum += a[i][j];
//             System.out.println(sum);
//         }
// }


//SUM OF ROWS AND SUM OF COLUMNS
class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a [] [] = new int [n] [n] , rsum [] = new int [n] , csum[] = new int [n] ;
        for(int i = 0; i < n ; i++)   //get the input
                for(int j = 0 ; j < n ; a [i] [j++] = sc.nextInt());
                
        for(int i = 0; i < n ; i++)
            for(int j = 0 ; j < n ; j++) {

            rsum[i]+=a[i][j];
            csum[j]+=a[i][j];



            }

            System.out.println(Arrays.toString(rsum));
            System.out.println(Arrays.toString(csum));
        }
}
