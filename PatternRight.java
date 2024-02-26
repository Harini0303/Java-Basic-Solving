import java.util.*;


class PatternRight{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i > 0 ; i-- , System.out.println()){
            for ( int j = 0 ; j <= i ; j--){
                System.out.print("*");
            }
             
        }

// String  str ="*";
// for(int i = 0 ; i <= n ; i++){
//     System.out.println(str.repeat(i));
// }

// String  str ="*";
// for(int i = n; i >=1 ; i--){
//     System.out.println(str.repeat(i));
//     }

  }
}