import java.util.Scanner;
public class Bananas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();

        int i= 1,  total = 0;
        while (i < w+1){
            total += k*i;
            i++;
        }
        if(total < n){
            System.out.println(0);
        }else{
            System.out.println(total-n);
        }
    }
}
