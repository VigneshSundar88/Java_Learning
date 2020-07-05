import java.util.Scanner;

public class Problem_6 {
    public void javaLoop2(int inp_1, int inp_2, int inp_3){
        int powerVal = 0;
        for(int j=0; j<inp_3; j++){
            if(j==0){
                int returnVal = inp_1+(int) Math.pow(2, j)*inp_2;
                powerVal += returnVal;
            }else{
                int returnVal = (int) Math.pow(2, j)*inp_2;
                powerVal += returnVal;
            }
            System.out.print(powerVal+" ");
        }
    }
}
