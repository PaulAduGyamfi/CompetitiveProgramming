import java.util.Scanner;
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] matrix = new int[5][5];
        for(int row = 0; row < 5; row++){
            for(int column = 0; column < 5; column++){
                matrix[row][column] = in.nextInt();
                if(matrix[row][column] == 1){
                    System.out.println(Math.abs(row-2) + Math.abs(column-2));
                }
            }
        }
    }
}
