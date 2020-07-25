class Arithmetic{
    String add(int a, int b){
        int c = a+b;
        return Integer.toString(c);
    }
}

class Adder extends Arithmetic{

}

public class OOPS_Prob_2 {
    public static void main(String[] args) {
        Adder e = new Adder();
        System.out.println("My superclass is: "+ args.getClass().getSuperclass().getName());
        System.out.println(e.add(10, 32)+" "+e.add(10, 3)+" "+e.add(10, 10)+ "\n");
    }
}
