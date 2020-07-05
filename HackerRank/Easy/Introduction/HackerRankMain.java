import java.util.Scanner;

public class HackerRankMain {
    public static void main(String[] args){
        /*Problem_1 prob1 = new Problem_1();
        System.out.println("The first value is: "+prob1.a);
        System.out.println("The second value is: "+prob1.b);

        System.out.println("Enter the input for Problem 2: ");
        Scanner scanner = new Scanner(System.in);
        //Problem_2 prob2 = new Problem_2();
        System.out.println(prob2.ifProb(scanner));*/

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Problem_3 prob3 = new Problem_3();
        prob3.multiData(scanner1, scanner2, scanner3);

        /*Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            String s1 = sc.next();
            int x = sc.nextInt();
            Problem_4 prob4 = new Problem_4();
            prob4.printFormat(s1, x);
        }

        Scanner scan1 = new Scanner(System.in);
        Problem_5 prob_5 = new Problem_5();
        prob_5.multiplyResult(scan1.nextInt());

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int j = in.nextInt();
            Problem_6 prob_6 = new Problem_6();
            prob_6.javaLoop2(a, b, j);
        }

        Scanner sc = new Scanner(System.in);
        int inpVal1 = sc.nextInt();
        for(int i=0;i<inpVal1;i++){
            Problem_7 prob7 = new Problem_7();
            prob7.dataType(sc);
        }

        Scanner prob8_inp = new Scanner(System.in);
        Problem_8 prob_8 = new Problem_8();
        prob_8.endOfFile(prob8_inp);

        Scanner prob10_inp = new Scanner(System.in);
        int int_input_prob10 = prob10_inp.nextInt();
        String str_input_prob_10 = Integer.toString(int_input_prob10);
        Problem_10 prob_10 = new Problem_10();
        prob_10.checkInt(int_input_prob10, str_input_prob_10);*/
    }
}
