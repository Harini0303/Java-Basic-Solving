import java.util.*;

class PatternOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n ; i++ , System.out.println()){
            for ( int j = 0 ; j < n ; j++){
                //System.out.println("i:"+i+","+"j:"+j);
                System.out.println("*");
            }
        }
    }
}