import java.util.*;

public class QuestionFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isExit = true;
        ArrayList<Book> books = new ArrayList<>();
        HashMap<Book, Integer> hmap = new HashMap<Book, Integer>();
        while (isExit) {
                //Getting user inputs
                String title = validateString("Enter Book title : ");
                System.out.print("Enter Book price : ");
                double price = input.nextDouble();
                int year = validateYear("Enter the publication year : ");
                String author = validateString("Enter the author : ");

                books.add(new Book(title, price, year, author));

                for (int i = 0; i < books.size(); i++) {
                    System.out.print("Please, enter the number of the shelf where is placed the book " + books.get(i).getTitle() +": ");
                    int numShelf = input.nextInt();
                    /*Adding elements to HashMap*/
                    hmap.put(books.get(i), numShelf);
                }

                try{
                    boolean correctChar = true;
                    while(correctChar){
                        System.out.print("Press (y) to continue or (n) to exit :");
                        String exit = input.next();
                        if (!exit.equals("n") && !exit.equals("y")){
                            System.out.println("Wrong choicee!!");
                        }else{
                            correctChar = false;
                            if (exit.equals("n")) isExit = false;
                            else continue;
                        }
                    }
                }catch (InputMismatchException e){
                    System.out.println("Invalid input, please enter a number.");
                }



                for (int i = 0; i < books.size(); i++) {
                    System.out.println(books.get(i).toString());
                }

                Collections.sort(books);

                for (int i = 0; i < books.size(); i++) {
                    System.out.println(books.get(i).toString());
                }
        }

        try{
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
        }catch (InputMismatchException e){
            System.out.println("Invalid Input!");
        }
    }

    /**
     * Method to validate the strings
     * @param message
     * @return
     */
    public static String validateString(String message) {
        Scanner input = new Scanner(System.in);
        String name = null;
        boolean isCorrectInput = true;

        while (isCorrectInput) {
            System.out.print(message);
            name = input.next();       //Getting input
            //name.matches code is taken from https://www.techiedelight.com/check-string-contains-only-alphabets-java/
            if (name.matches("^[a-zA-Z]*$")) {           //This will check whether the entered name contains alphabets.
                isCorrectInput = false;
            }else{
                System.out.println("\nError! Name can only contains letters.\n");
            }
        }
        return name;
    }

    /**
     * Method to validate the year
     * @param year
     * @return
     */
    public static int validateYear(String year){
        Scanner input = new Scanner(System.in);
        int number = 0;
        boolean isCorrectInput = true;

        while(isCorrectInput){
            try{
                System.out.print(year);
                number = Integer.parseInt(input.next());     //Getting input
                if (number < 0 || number > 2023){
                    System.out.println("Error in year!");
                }else{
                    isCorrectInput = false;
                }
            }catch (NumberFormatException e1){
                System.out.println("\nError! Input must be an integer.\n");
            }
        }
        return number;
    }
}
