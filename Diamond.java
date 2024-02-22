import java.util.*;


//METHOD 1
class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n * 2 - 2;

        for (int i = 0; i < n * 2 - 1; i++, System.out.println()) {
            int ri = x - i, min = Math.min(i, ri);
            for (int j = 0; j <= (n - 1) + min; j++) {
                System.out.print(j < (n - 1) - min ? " " : "*");
            }
        }
    }
}

// METHOD 2

// class Diamond {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 0 ; i < n ; i++ , System.out.println()){
//             for(int j = 0 ; j <= (n - 1) + i ; j++ ){
//                 System.out.print( j < (n - 1) - i? " ":"*");

//             } 
//             }

//             for(int i = n-2;i>=0;i--,System.out.println()){
//                 for(int j = 0 ; j <= (n - 1) + i ; j++){
//                     System.out.print(j<(n - 1)-i? " ":"*");
//                 }

//             }

//         }
//     }











