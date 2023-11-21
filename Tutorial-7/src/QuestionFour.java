import java.util.*;

public class QuestionFour {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isExit = true;
        ArrayList<Book> books = new ArrayList<>();
        while (isExit) {

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
            if (exit.equals("n")) isExit = false;
            else continue;

            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i).toString());
            }

            Collections.sort(books);

            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i).toString());
            }
        }

        HashMap<Book, Integer> hmap = new HashMap<Book, Integer>();

        for (int i = 0; i < books.size(); i++) {
            System.out.print("Please, enter the number of the shelf where is placed the book" + books.get(i).getTitle());
            int numShelf = input.nextInt();
            /*Adding elements to HashMap*/
            hmap.put(books.get(i), numShelf);

        }

        System.out.print("Insert the number of the shelf");
        int selectedShelf = input.nextInt();
        System.out.println("The book in shelf " + selectedShelf + " are:");
        /* Display content using Iterator*/
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            if(selectedShelf == (int) entry.getValue()){
                System.out.println(((Book)entry.getKey()).getTitle());
            }
        }
    }
}
