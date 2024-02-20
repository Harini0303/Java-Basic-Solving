// import java.util.*;
// import java.util.Scanner;

// public class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt();

//         int [] arr = new int[N];

//         for(int i = 1 ; i <= arr.length ; i++){
//             System.out.print(i * i +" ");

//         }


//     }
// }


import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the first array
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();

        // Read the elements of the first array
        System.out.print("Enter the elements of the first array: ");
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Read the size of the second array
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();

        // Read the elements of the second array
        System.out.print("Enter the elements of the second array: ");
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Generate the third array containing common elements
        int[] commonArray = findCommonElements(array1, array2);

        // Print the common elements
        System.out.println("Common elements: ");
        for (int element : commonArray) {
            System.out.print(element + " ");
        }
    }

    private static int[] findCommonElements(int[] array1, int[] array2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> commonSet = new HashSet<>();

        // Add elements of array1 to set1
        for (int element : array1) {
            set1.add(element);
        }

        // Check for common elements with array2
        for (int element : array2) {
            if (set1.contains(element)) {
                commonSet.add(element);
            }
        }

        // Convert commonSet to an array
        int[] commonArray = new int[commonSet.size()];
        int index = 0;
        for (int element : commonSet) {
            commonArray[index++] = element;
        }

        return commonArray;
    }
}

