import java.util.Arrays; 

import java.util.Scanner; 

public class UpperLower { 

 public static void main(String []arg) { 

 Scanner sc = new Scanner(System.in); 

 char s[] = sc.nextLine().toCharArray(); 

 for(int i=0 ; i<s.length ; i++) { 

 if(Character.isUpperCase(s[i])) s[i] += 32; 

 else if(Character.isLowerCase(s[i])) s[i] -= 32; 

 else s[i] = s[i];

 } 

 System.out.println(s); 

 } 

} 