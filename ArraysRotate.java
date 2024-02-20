import java.util.*;
import java.util.Arrays;

class ArraysRotate{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int arr[] = {1,2,3,4,5};

        int n = sc.nextInt();

//         for(int i = 0; i < n ; i++){
        
//             int temp = arr[arr.length-1];

//             for(int j = arr.length-1 ; j > 0 ; j--){
//                 arr[j]= arr[j-1];
                
//             }
//             arr[0] =temp;
            
//         }

//         for(int i = 0 ; i < arr.length ; i++){
//             System.out.print(arr[i]+" ");
//         }

      

//     }
// }

for(int i = 0; i < n ; i++){
        
    int temp = arr[0];

    for(int j = 0 ; j < arr.length-1 ; j++){
        arr[j]= arr[j+1];
        
    }
    arr[arr.length-1] =temp;
    
}

for(int i = 0 ; i < arr.length ; i++){
    System.out.print(arr[i]+" ");
}



}
}