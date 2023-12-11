import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        try{
            int myArray[] = new int[5];
            // trying to access element 5
            System.out.println(myArray[5]);
        }
            catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The element " + e.getMessage() + " does not exist!");
        }

         */
        try {
            Scanner input = new Scanner(System.in);
            int value = 0;
            System.out.println("Please enter an integer");
            value = input.nextInt();
            System.out.println("Value: " + value);
        } catch (InputMismatchException e){
            System.out.println("Invalid input " + e);
        }

    }
}