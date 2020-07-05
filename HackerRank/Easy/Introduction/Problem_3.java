import java.util.Scanner;

//I get three different inputs from scanner for this class
//For this class, I had to return more than one value of different data types,
//so I am using the same name for the class and the method


public class Problem_3 {
        public void multiData(Scanner a, Scanner b, Scanner c){
            int int_val =  a.nextInt();
            Double double_val = b.nextDouble();
            String str_val = c.nextLine();
            System.out.println(int_val + " "+ double_val +" "+str_val);
    }
}
