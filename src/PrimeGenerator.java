import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class PrimeGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num_of_tests = in.nextInt();

        HashMap<Integer, Integer> test_cases = new HashMap<>();

        for(int i =0; i<num_of_tests; i++){
            int start = in.nextInt();
            int end = in.nextInt();

            test_cases.put(start,end);

        }

        System.out.println();

        for(Map.Entry<Integer,Integer> test : test_cases.entrySet()){

            int i = 2;
            int number = test.getKey();
            int num2 = test.getValue();

            while((number <= num2)){
                if(i>Math.sqrt(number)){
                    i=2;
                }

                if(number == 2){
                    System.out.println(2);
                }

                if( number % i != 0 && number > 2){
                    System.out.println(number);
                }
                number++;
                i++;

            }
            System.out.println();
        }
    }
}
