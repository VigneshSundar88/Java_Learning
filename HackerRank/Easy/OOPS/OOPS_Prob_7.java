import java.util.ArrayList;
import java.util.Scanner;

class Student{}
class Rockstar{}
class Hacker{}

public class OOPS_Prob_7{

    static String count(ArrayList myList){
        int a=0;int b=0;int c=0;
        for(int i=0;i<myList.size();i++){
            Object element = myList.get(i);
            if(element instanceof Student)
                a++;
            if(element instanceof Rockstar)
                b++;
            if(element instanceof Hacker)
                c++;
        }
        String ret = Integer.toString(a)+" "+Integer.toString(b)+" "+Integer.toString(c);
        return ret;
    }

    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            String s = sc.next();
            if(s.equals("Student"))myList.add(new Student());
            if(s.equals("Rockstar"))myList.add(new Rockstar());
            if(s.equals("Hacker"))myList.add(new Hacker());
        }
        System.out.println(count(myList));
    }
}
