/*when all the values are zeroes
except the 3 not null values in the first and third array & one not null value in the second array
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

public class DS_Problem_2 {
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
        int finalSum = 0;
        for(int k=0;k<2;k++){
            int sumTotal = 0;
            if(k!=0)k=3;
            List<int[]> inpList = asList(arr).subList(k, k+3);
            for(int i=0; i<inpList.size(); i++){
                int[] subArray = inpList.get(i);
                for(int l=0;l<subArray.length;l++){
                    sumTotal+=subArray[l];
                }
            }//System.out.println(sumTotal);
            if(sumTotal > finalSum){
                finalSum = sumTotal;
            }
            //System.out.println(finalSum);
            //System.out.println(Arrays.deepToString(inpList.toArray()));
            //System.out.println(Arrays.asList(arr));
            //System.out.println(Arrays.asList(arr[k]).subList(k, k+1));
        }System.out.println(finalSum);
    }
}
