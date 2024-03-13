import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int R = sc.nextInt();
        int T = sc.nextInt();

        int r = P*R*T ;

        System.out.println(r/100);

    }

    
}

