import java.util.Scanner;
import java.util.Arrays;

// public class yazlini {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt(), c=0;
//         for (int i = 10 ; i <=n ; i++){
//             if (i%11 == 0)  c++;
//         }

//         if
//         System.out.println(c+9);
//     }    

// }


// public class yazlini {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt(), 
//         len = Integer.toString(n).length()-1, ones = 0;

//         System.out.println(len*9);
//         do{
//             ones = ( ones * 10 ) + 1 ;
//         }while ((t/=10)!=0);

//         System.out.println(len*9 +" " +n/ones);

        

//     }
// }



public class yazlini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t = n ,
        len = Integer.toString(n).length()-1, ones = 0;

        // System.out.println(len*9);
        do{
            ones = ( ones * 10 ) + 1 ;
        }while ((t/=10)!=0);

        System.out.println((len*9) + n / ones);

        

    }
}