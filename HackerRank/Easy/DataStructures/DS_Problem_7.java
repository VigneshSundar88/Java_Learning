import java.util.HashSet;
import java.util.Scanner;

public class DS_Problem_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of test cases: ");
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];
        HashSet<String> inpSet = new HashSet<>();

        for(int i=0;i<t;i++){
            System.out.println("Enter the left side name: ");
            pair_left[i] = s.next();
            System.out.println("Enter the right side name: ");
            pair_right[i] = s.next();
        }for(int j=0;j<pair_left.length;j++){
            //System.out.println(pair_left[j]+" "+pair_right[j]);
            inpSet.add(pair_left[j]+" "+pair_right[j]);
            System.out.println(inpSet.size());
        }
    }
}
