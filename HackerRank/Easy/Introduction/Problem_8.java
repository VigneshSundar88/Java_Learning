import java.util.Scanner;

public class Problem_8 {
    public void endOfFile(Scanner a){
        for(int i=1;a.hasNext();i++){
            System.out.println(i+" "+a.nextLine());
        }
    }
}
