import java.util.*;

public class Problem_3 {
    public static String getSmallAndLargest(String s, int k){
        List<String> lst_1 = new ArrayList<>();
        int loopRange = s.length() - k;
        for(int v=0;v<=loopRange;v++){
            //System.out.println("v"+v+"k"+k);
            //System.out.println(s.substring(v, k));
            lst_1.add(s.substring(v, k));
            k=k+1;
        }
        Collections.sort(lst_1);
        return lst_1.get(lst_1.size()-1)+"\n"+lst_1.get(0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String parseWord = in.next();
        int subStrVal = in.nextInt();
        System.out.println(Problem_3.getSmallAndLargest(parseWord, subStrVal));
    }

}
