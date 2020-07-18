import java.util.ArrayList;
import java.util.Scanner;

public class DS_Problem_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> finalArr = new ArrayList<>();
        System.out.println("No of Test Cases: ");
        int noOfTestCases = in.nextInt();
        for(int i=0;i<noOfTestCases;i++){
            ArrayList<Integer> instanceArr = new ArrayList<>();
            System.out.println("No of values to add for instance Arr: ");
            int instanceArrSize = in.nextInt();
            for(int j=0;j<instanceArrSize;j++){
                System.out.println("Values to add for instance Arr: ");
                instanceArr.add(in.nextInt());
            }finalArr.add(instanceArr);
        }
        System.out.println("No of questions: ");
        int noOfQuestions = in.nextInt();
        for(int k=0;k<noOfQuestions;k++){
            System.out.println("Array Index: ");
            int x = in.nextInt();
            System.out.println("Value Index: ");
            int y = in.nextInt();
            try{
                System.out.println(finalArr.get(x-1).get(y-1));
            }catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
    }
}
