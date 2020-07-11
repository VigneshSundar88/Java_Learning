import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inpVal = scan.nextLine().trim();
        scan.close();
        if(inpVal.length() > 0 && inpVal.length() < 400000){
            String delims = "[ !,?._'@]+";
            String[] inpArray = inpVal.split(delims);
            System.out.println(inpArray.length);
            for(int i=0;i<inpArray.length;i++){
                System.out.println(inpArray[i]);
            }
        }else{
            System.out.println(0);
        }
    }
}
