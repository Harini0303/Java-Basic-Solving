//Write a Java Program to swap two numbers using the third variable.

import java.util.Scanner;
 
class SwapTwoNumbers {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x, y, temp;
        System.out.println("Enter x and y");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        System.out.println("Before Swapping" + x + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping" + x + y);
         
    }
 
}
