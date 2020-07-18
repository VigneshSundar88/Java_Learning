import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DS_Problem_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("No of phonebook entries");
        int noOfEntries = in.nextInt();
        in.nextLine();
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<noOfEntries;i++){
            System.out.println("Enter the contact name: ");
            String contactName = in.nextLine();
            System.out.println("Enter the contact number: ");
            int contactNumber = in.nextInt();
            in.nextLine();
            map.put(contactName, contactNumber);
    }
        //System.out.println(map);
        while(in.hasNext()){
            String s = in.nextLine();
            if(map.containsKey(s)){
                System.out.println(s+"="+map.get(s));
            }else if(!map.containsKey(s)){
                System.out.println("Not Found");
            }
        }
    }
}
