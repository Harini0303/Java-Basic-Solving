//Write a Java Program to reverse a string without using String inbuilt function.


//FinalReverseWithoutUsingStringMethods
class ReverseString {
  
    public static void main(String[] args) {
         // TODO Auto-generated method stub
         String str = "Automation";
         StringBuilder str2 = new StringBuilder();
         str2.append(str);
         str2 = str2.reverse();     // used string builder to reverse
        System.out.println(str2);
         }
 
}



// Write a Java Program to reverse a string without using String inbuilt function reverse().

// class FinalReverseWithoutUsingInbuiltFunction {
//     public static void main(String[] args) {
//         String str = "Saket Saurav";
//         char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
//         for(int i= chars.length-1; i<=0; i--) {
//             System.out.print(chars[i]);
//         }
//     }
// }

