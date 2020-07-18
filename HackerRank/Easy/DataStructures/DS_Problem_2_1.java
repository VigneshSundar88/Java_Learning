import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DS_Problem_2_1 {
    private static int solution2(int [][] arrVal){
        int maxValue = Integer.MIN_VALUE;
        //List<int []> arrSub = Arrays.asList(arrVal[0]);
        //System.out.println(Arrays.deepToString(arrSub.toArray()));
        int width = arrVal[0].length - 2;
        for(int row=0;row< arrVal.length - 2;row++){
            for(int col=0;col<width;col++){
                maxValue = Math.max(maxValue, arrVal[row][col]+arrVal[row][col+1]+arrVal[row][col+2]
                                                              +arrVal[row+1][col+1]+
                                              +arrVal[row+2][col]+arrVal[row+2][col+1]+arrVal[row+2][col+2]);
            }
        }return maxValue;
    }

    public static void main(String[] args) {
        Scanner inpVal = new Scanner(System.in);
        int [][] arr = new int[6][6];
        for(int i=0; i<6; i++){
            String[] arrRowItems = inpVal.nextLine().split(" ");
            inpVal.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for(int j=0; j<6;j++){
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }//System.out.println(Arrays.deepToString(arr));
        }inpVal.close();
        System.out.println(solution2(arr));
}}
