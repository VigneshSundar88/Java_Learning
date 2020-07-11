import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Problem_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noOfTestCases = Integer.parseInt(scan.nextLine());
        while(noOfTestCases > 0){
            String pattern = scan.nextLine();
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch (PatternSyntaxException e){
                System.out.println("Invalid");
            }noOfTestCases --;
        }
    }
}
