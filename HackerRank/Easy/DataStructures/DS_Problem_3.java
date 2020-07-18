import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DS_Problem_3 {
    private static int noOfNegativeVal(int[] arrVal){
        int noOfNegativeVal = 0;
        for(int j=0;j<arrVal.length;j++){
            int totalSum = 0;
            for(int k=j;k<arrVal.length;k++){
                totalSum+=arrVal[k];
                if(totalSum < 0){
                    noOfNegativeVal++;
            }
            }
        }return noOfNegativeVal;
    }
    public static void main(String[] args) {
        Scanner inpCases = new Scanner(System.in);
        int noOfTestCases = inpCases.nextInt();
        int[] A = new int[noOfTestCases];
        for(int i=0;i<noOfTestCases;i++){
            int arrayVal = inpCases.nextInt();
            A[i] = arrayVal;
            }
        System.out.println(noOfNegativeVal(A));
    }
}
