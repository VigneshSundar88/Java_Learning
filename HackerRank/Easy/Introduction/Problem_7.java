import java.util.Scanner;

public class Problem_7 {
    public void dataType(Scanner inputVal){
        try{
            long x = inputVal.nextLong();
            System.out.println(x+" can be fitted in: ");
            if(x>=-128 && x<=127)System.out.println("* byte");
            if(x>=-32768 && x<=32768)System.out.println("* short");
            if(x>=-Math.pow(2, 31) && x<=Math.pow(2, 31)-1)System.out.println("* int");
            if(x>=-Math.pow(2, 63) && x<=Math.pow(2, 63))System.out.println("* long");
        }
        catch(Exception e){
            System.out.println(inputVal.next()+" can't be fitted anywhere.");
        }
    }
}
