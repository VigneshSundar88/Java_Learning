import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OOPS_Prob_8 {
    static Iterator func(ArrayList myList){
        Iterator it = myList.iterator();
        while(it.hasNext()){
            Object element = it.next();
            if(element instanceof String)
                break;
        }
        return it;
    }

    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int m = src.nextInt();
        for(int i=0;i<n;i++){
            myList.add(src.nextInt());
        }
        myList.add("####");
        for(int j=0;j<m;j++){
            myList.add(src.next());
        }
        Iterator it = func(myList);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println(myList);
            System.out.println((String) element);
        }
    }
}
