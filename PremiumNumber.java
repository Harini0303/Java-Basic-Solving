import java.util.*;

class Premium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i;

        int[] a = new int[n];

        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Find and sum premium numbers
        int premiumSum = 0;
        for (i = 0; i < n; i++) {
            if (isPremium(a[i])) {
                premiumSum += a[i];
            }
        }

        System.out.println(premiumSum);
    }

    // Function to check if a number is premium
    static boolean isPremium(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}


//TO CHECK PRIME OR NOT USING SEIVE ALOGORITHM

//  public static void main(String []arg) { 

//  Scanner sc = new Scanner(System.in); 

//  int n = sc.nextInt(), i; 

//  boolean prime = true; 

//  if(n!=2 && n%2==0) prime = false; 

//  else 

//  for(i=2;i<=Math.sqrt(n);i++) { 

//  if(n%i==0) { 

//  prime = false; break; 

//  } 

//  } 

//  System.out.println(prime); 

// } 

// } 
