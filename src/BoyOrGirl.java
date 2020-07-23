import java.util.HashMap;
import java.util.Map;
import  java.util.Scanner;
public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Character, Integer> letters = new HashMap<>();

        String username = in.next();

        for(int i =0; i<username.length(); i++){
            if(letters.containsKey(username.charAt(i))){
                letters.put(username.charAt(i), letters.get(username.charAt(i))+1);
            }else{
                letters.put(username.charAt(i), 1);
            }
        }

        int num_distinct_characters = 0;

        for(Map.Entry<Character,Integer> entry : letters.entrySet()){
            num_distinct_characters++;
        }

        if(num_distinct_characters % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else {
            System.out.println("IGNORE HIM!");
        }
    }
}
