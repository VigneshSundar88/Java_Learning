import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem_5 {
    static Boolean isAnagram(String a, String b){
        if(a == null || b == null || a == "" || b == ""){
            return false;
        }
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0;i<aLower.length();i++){
            if(!map.containsKey(aLower.charAt(i))){
                map.put(aLower.charAt(i), 1);
            }else{
                int frequency = map.get(aLower.charAt(i));
                map.put(aLower.charAt(i), ++frequency);
            }
        }
        for(int j=0;j<bLower.length();j++){
            if(!map.containsKey(bLower.charAt(j))){
                return false;
            }else{
                int frequency = map.get(bLower.charAt(j));
                if(frequency != 0){
                    map.put(bLower.charAt(j), --frequency);
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        //scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams":"Not Anagrams");
    }
}
