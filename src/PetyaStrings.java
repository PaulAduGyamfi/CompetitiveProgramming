import java.util.Scanner;
public class PetyaStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String top = in.next();
        String bottom = in.next();

        if(top.compareToIgnoreCase(bottom) > 0){
            System.out.println(1);
        }else if(top.compareToIgnoreCase(bottom) < 0){
            System.out.println(-1);
        }else if(top.compareToIgnoreCase(bottom) == 0){
            System.out.println(0);
        }
    }


}
