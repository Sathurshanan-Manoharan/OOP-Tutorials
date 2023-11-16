import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = input.next();

        char[] array = word.toCharArray();
        boolean isDuplicate = true;
        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]){
                    isDuplicate = false;
                    break;
                }
            }
        }

        if(!isDuplicate){
            System.out.println("Word has duplicate letters...");
        }else{
            System.out.println("Word has no duplicate letters...");
        }


    }
}