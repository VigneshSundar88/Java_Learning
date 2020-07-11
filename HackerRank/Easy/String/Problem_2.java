import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int Start = in.nextInt();
        int End = in.nextInt();
        System.out.println(S.substring(Start, End));
    }
}
