import java.util.Scanner;

//This class gets the input from the scanner, to get the input we are creating a method under the class
//As this method returns only string, we are giving the return type for the method as String

public class Problem_2 {
    Problem_2(){

    }
    public String ifProb(Scanner a){
        int b = a.nextInt();
        if (b % 2 != 0) {
            return "Weird";
        } else if (b % 2 == 0 && b >= 2 && b <= 5) {
            return "Not Weird";
        } else if (b % 2 == 0 && b >= 6 && b <= 20) {
            return "Weird";
        } else if (b % 2 == 0 && b > 20) {
            return "Not Weird";
        }
        return null;
    }}
