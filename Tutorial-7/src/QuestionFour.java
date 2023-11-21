import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        boolean isExit = true;
        ArrayList<Book> books = new ArrayList<>();
        while(isExit){

            Scanner input = new Scanner(System.in);
            System.out.print("Enter Book title : ");
            String title = input.next();
            System.out.print("Enter Book price : ");
            double price = input.nextDouble();
            System.out.print("Enter the publication year : ");
            int year = input.nextInt();
            System.out.print("Enter the author : ");
            String author = input.next();

            books.add(new Book(title, price, year, author));

            System.out.print("Press y to continue or n to exit :");
            String exit = input.next();
            if (exit.equals("n"))isExit = false;
            else continue;

            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i).toString());
            }

            Collections.sort(books);

            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i).toString());
            }
        }



    }
}
