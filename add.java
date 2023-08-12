import java.util.*;
import java.io.*;
import java.lang.*;

class Add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String scn=sc.nextLine();
        sc.close();
        int ii=0;
        int ss=0,dd=0;
        boolean sflag=true,iflag=true;
        String sen = "Hello World";
        String[] sen2 = sen.split("");
        for(int i=0;i<sen2.length;i++) {
            try {
                Integer d = Integer.parseInt(sen2[i]);

            }catch(NumberFormatException ex1) {
                iflag=false;
            }
            if(iflag==false) {
                try {
                    Double g =Double.parseDouble(sen2[i]);

                }catch(NumberFormatException ex1){
                    sflag=false;

                }
            }
            if(iflag)
            ii=ii+1;
            if(sflag==true&& iflag==false)
            dd=dd+1;
            if(sflag==false)
            ss=ss+1;
            iflag=true;
            sflag=true;
        }
        System.out.println("string"+ss);
        System.out.println("integer"+ii);
        System.out.println("double"+dd);

        
    }
}