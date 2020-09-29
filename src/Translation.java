import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word1 = in.next();
        String word2 = in.next();

        if(word1.length() != word2.length()){
            System.out.println("NO");
        }
        else if(word1.equalsIgnoreCase("t") && word2.equalsIgnoreCase("s") || word2.equalsIgnoreCase("t") && word1.equalsIgnoreCase("s")){
            System.out.println("YES");
        }
        else{
            int pointerA = 0;
            int pointerB = word2.length()-1;
            while(pointerA <= word1.length() && pointerB >= 0){
                if(word1.charAt(pointerA) != word2.charAt(pointerB)){
                    System.out.println("NO");
                    return;
                }
                pointerA++;
                pointerB--;
            }
            System.out.println("YES");
        }
    }
}
