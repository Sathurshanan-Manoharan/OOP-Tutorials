import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Creating a scanner object to get a keyboard input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = input.nextInt();

        //Close the scanner to release resources
        input.close();

        if (marks >= 75){
            System.out.println("A");
        }else if (marks >= 65){
            System.out.println("B");
        }else if (marks >= 55){
            System.out.println("C");
        }else if (marks >= 45){
            System.out.println("S");
        }else{
            System.out.println("F");
        }

    }
}