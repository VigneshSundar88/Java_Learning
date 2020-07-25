/*Like a class, an interface can have methods and variables, but the methods declared in an interface are by default abstract (only method signature, no body).

        Interfaces specify what a class must do and not how. It is the blueprint of the class.
        An Interface is about capabilities like a Player may be an interface and any class implementing Player must be able to (or must implement) move(). So it specifies a set of methods that the class has to implement.
        If a class implements an interface and does not provide method bodies for all functions specified in the interface, then the class must be declared abstract.
        A Java library example is, Comparator Interface. If a class implements this interface, then it can be used to sort a collection.*/

import java.util.Scanner;

interface AdvancedArithmetic{
    int divisor_sum(int n);
}

class OOPS_Prob_4 implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int final_sum = 0;
        for(int j=1;j<=n;j++){
            if(n%j==0){
                final_sum+=j;
            }
        }return final_sum;
    }
}

class Solution{
    public static void main(String[] args) {
        OOPS_Prob_4 prob4 = new OOPS_Prob_4();
        System.out.println("I implemented: ");
        ImplementedInterfaceNames(prob4);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(prob4.divisor_sum(n)+"\n ");
        sc.close();
    }

    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for(int i=0;i<theInterfaces.length;i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}