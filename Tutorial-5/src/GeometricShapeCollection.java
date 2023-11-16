import java.util.ArrayList;
import java.util.Scanner;

public class GeometricShapeCollection implements ShapeCollection{
    private ArrayList<GeometricObject> shapeList;  //arraylist attribute
    private int numObject; //integer numObject attribute

    public GeometricShapeCollection(int listLength){
        this.numObject = listLength;
        shapeList = new ArrayList<GeometricObject>();
    }

    //Overridden method to add a shape
    @Override
    public void addShape(GeometricObject shape) {
        // check if there are spaces and add the shape to the list
        if (shapeList.size() < numObject){
            shapeList.add(shape);
        }
        else{
            System.out.println("No more space in the list");
        }
    }

    //Overridden method to print the shape list
    @Override
    public void printShapeList() {
        for(int i=0; i < shapeList.size(); i++){
            if(shapeList.get(i).getShape().equals("Circle")){
                System.out.println("\n* Shape = Circle, Area = " + shapeList.get(i).getArea() + ", Perimeter = " + shapeList.get(i).getPerimeter());
            } else if (shapeList.get(i).getShape().equals("Square")) {
                System.out.println("\n* Shape = Square, Area = " + shapeList.get(i).getArea() + ", Perimeter = " + shapeList.get(i).getPerimeter());
            }else{
                System.out.println("\n* Shape = Rectangle, Area = " + shapeList.get(i).getArea() + ", Perimeter = " + shapeList.get(i).getPerimeter());
            }
        }
    }

    //Method that has the main functionalities
    @Override
    public boolean runMenu() {
        boolean exit = false;
        System.out.println("1. To Add a new shape press 1");
        System.out.println("2. To print the list of the shapes press 2");
        System.out.println("3. To exit press 3");
        System.out.print("\nEnter your choice : ");

        Scanner s = new Scanner (System.in);
        int choice = s.nextInt(); //Getting user's choice

        switch(choice){
            case 1:
                System.out.println("\nPress 1 if you want to add a Circle");
                System.out.println("Press 2 if you want to add a Rectangle");
                System.out.println("Press 3 if you want to add a Square");
                System.out.print("Enter your desired object : ");

                int choice2 = s.nextInt(); // Getting the desired object

                System.out.print("\nEnter the color of your shape : ");
                String colour = s.next(); // Getting the colour of the shape from the user

                System.out.print("\nIs it filled? (y/n) : ");
                String isFilled = s.next();
                boolean filled = false;

                if (isFilled.equals("y")) filled = true;
                else if (isFilled.equals("n")) filled = false;
                else
                System.out.println("Please enter y or n, if the shape is filled or not respectively");
                switch (choice2){
                    case 1:
                        // its a circle
                        System.out.print("\nInsert the radius : ");
                        int radius = s.nextInt(); //Getting the radius from the user
                        Circle circle = new Circle(radius, colour, filled); // Creating the circle object
                        this.addShape(circle);
                        break;
                    case 2:
                        // TODO - write here the code if the rectangle is selected
                        // its a rectangle
                        System.out.print("\nInsert the length :");
                        int length = s.nextInt(); //Getting the length from the user
                        System.out.print("Insert the width :");
                        int width = s.nextInt(); //Getting the width from the user
                        Rectangle rectangle = new Rectangle(length, width, colour, filled); // Creating the rectangle object
                        this.addShape(rectangle);
                        break;
                    case 3:
                        // TODO - write here the code if the square is selected
                        // its a square
                        System.out.print("\nInsert the side :");
                        int side = s.nextInt(); //Getting the side from the user
                        Square square = new Square(side, colour, filled); // Creating the square object
                        this.addShape(square);
                        break;
                }
                break;
            case 2:
                this.printShapeList(); //Calling the printShapeList method
                break;
            case 3:
                exit = true;
                break;
        }
        return exit;
    }
}