import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        String outcome = in.next();

        int Anton = 0;
        int Danik = 0;

        for(int i = 0; i<length; i++){
            if(outcome.charAt(i) == 'D'){
                Danik++;
            }else{
                Anton++;
            }
        }

        if(Danik == Anton){
            System.out.println("Friendship");
        }else if(Danik > Anton){
            System.out.println("Danik");
        }else{
            System.out.println("Anton");
        }

    }
}
