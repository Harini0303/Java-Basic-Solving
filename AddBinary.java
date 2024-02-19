import java.util.Scanner; 

public class AddBinary { 

    static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        int i = a.length() - 1, j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }

            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            result.insert(0, sum % 2);
            carry = sum / 2;
        }

        return result.toString();
    }

 public static void main(String []arg) { 

 Scanner sc = new Scanner(System.in); 

 String s1 = sc.next();
 String s2 = sc.next();

 String result = addBinary(s1, s2);
 System.out.println(result);

//  System.out.println(Integer.valueOf(s1,2) + Integer.valueOf(s2,2) );
 }
}