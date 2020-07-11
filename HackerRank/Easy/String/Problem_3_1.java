import java.util.Scanner;

public class Problem_3_1 {
    public static String substrVal(String s, int k){
        String smallest = "";
        String largest = "";

        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        int rangeLoop = s.length() - k;
        for(int v=0;v<=rangeLoop;v++){
            if(s.substring(v, k).compareTo(smallest) < 0){
                smallest = s.substring(v, k);
            }
            if(s.substring(v, k).compareTo(largest) > 0){
                largest = s.substring(v, k);
            }
            k = k+1;
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inpVal = in.next();
        int pos = in.nextInt();
        System.out.println(Problem_3_1.substrVal(inpVal, pos));
    }
}
