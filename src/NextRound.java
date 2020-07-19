import java.util.Scanner;
public class NextRound {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[2];
        array[0] = in.nextInt();
        array[1] = in.nextInt();


        int[] scores = new int[array[0]];
        for(int i = 0; i<scores.length; i++){
            scores[i] = in.nextInt();
        }
        int advance = 0;
        for (int score : scores){
            if(score >= scores[array[1]-1] && score > 0 ){
                advance++;
            }
        }
        System.out.println(advance);
    }
}
