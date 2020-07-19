import java.util.Scanner;
public class Team {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int problems = in.nextInt();

        int[][] team = new int[problems][3];

        // Fill the matrix
        for(int rows =0; rows<problems; rows++){
            for (int colums=0; colums<3; colums++){
                team[rows][colums] = in.nextInt();
            }
        }

        int num_ready = 0;
        for(int rows =0; rows<problems; rows++){
            int count = 0;
            for (int columns=0; columns<3; columns++){
                if(team[rows][columns] == 1){
                    count++;
                }
            }
            if(count >= 2){
                num_ready++;
            }
        }

        System.out.println(num_ready);
        in.close();
    }
}
