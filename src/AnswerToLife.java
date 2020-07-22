import java.util.ArrayList;
import java.util.Scanner;
class AnswerToLife {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int number = 0;
        while(number != 42){
            number = in.nextInt();
           if(number != 42){
               numbers.add(number);
           }
        }
        for(int num : numbers){
            System.out.println(num);
        }
    }
}
