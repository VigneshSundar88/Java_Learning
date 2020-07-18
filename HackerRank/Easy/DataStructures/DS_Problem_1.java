import java.util.Scanner;

public class DS_Problem_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int val=0;val<n;val++){
            a[val] = scan.nextInt();
        }
        scan.close();
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
