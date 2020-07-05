import java.util.Scanner;

//To understand the usage of static keyword
public class Problem_9 {
    static boolean flag;
    static Scanner in = new Scanner(System.in);
    static int B = in.nextInt();
    static int H = in.nextInt();

    static{
    if(B > 0 && H >0){
        flag = true;
    }else{
        flag = false;
    }
    }
    public static void main(String[] args){
        if(flag){
            int area = B * H;
            System.out.println(area);
        }
    }
}
