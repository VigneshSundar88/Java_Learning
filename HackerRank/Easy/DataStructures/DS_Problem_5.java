import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DS_Problem_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the list length: ");
        int listLength = in.nextInt();
        //int[] inpList = new int[listLength];
        ArrayList<Integer> inpList = new ArrayList<>();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] listVal = in.nextLine().split(" ");
        for(int i=0;i<listLength;i++){
            inpList.add(Integer.parseInt(listVal[i]));
        }
        System.out.println("Enter the no of questions: ");
        int inpQuestions = in.nextInt();
        for(int j=0;j<inpQuestions;j++){
            System.out.println("Enter the command: ");
            String command = in.next();
            if (command.equals("Insert")) {
                System.out.println("Enter the arr index: ");
                int arrIndex = in.nextInt();
                System.out.println("Enter the arr value: ");
                int insVal = in.nextInt();
                inpList.add(arrIndex, insVal);
            }else if(command.equals("Delete")){
                int delIndex = in.nextInt();
                inpList.remove(delIndex);
            }
        }
        String finalStr = "";
        for(int k=0;k<inpList.size();k++){
            finalStr+=inpList.get(k)+" ";
        }
        System.out.println(finalStr);
    }
}
