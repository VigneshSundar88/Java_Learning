import java.util.Scanner;
import java.lang.*;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        String inpVal = A.next();
        String Reverse = "";
        int lengthOfString = inpVal.length();
        for(int i=lengthOfString-1;i>=0;i--){
            Reverse = Reverse+inpVal.charAt(i);
        }
        System.out.println(Reverse);
        if(Reverse.equals(inpVal)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
