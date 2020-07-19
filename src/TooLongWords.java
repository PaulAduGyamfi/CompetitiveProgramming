import java.util.Scanner;
public class TooLongWords {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        int num_words = in.nextInt();
        String[] words_array = new String[num_words];

        for (int i =0; i<words_array.length; i++){
            words_array[i] = in.next();
        }

        for(int i =0; i<words_array.length; i++){
            if(words_array[i].length() > 10){
                words_array[i] = shortener(words_array[i]);
            }
        }
        for(String word : words_array){
            System.out.println(word);
        }
        in.close();
    }

    public static String shortener(String long_word){
        String first = long_word.substring(0,1);
        String last = long_word.substring(long_word.length()-1);
        int middle = long_word.length()-2;

        return first + middle + last;

    }
}
