import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first_word = in.next();
        String second_word = in.next();

        int len_of_first_word = first_word.length();
        int len_of_second_word = second_word.length();
        System.out.println(len_of_first_word+len_of_second_word);
        int comp_string = first_word.compareTo(second_word);
        if(comp_string > 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(Character.toUpperCase(first_word.charAt(0))+first_word.substring(1)+" "+
                Character.toUpperCase(second_word.charAt(0))+second_word.substring(1));
    }
}
