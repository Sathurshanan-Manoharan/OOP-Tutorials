import java.util.ArrayList;
import java.util.Scanner;

public class GeometricShapeCollection implements ShapeCollection{
    private ArrayList<GeometricObject> shapeList;
    private int numObject;

    public GeometricShapeCollection(int listLength){
        this.numObject = listLength;
        shapeList = new ArrayList<GeometricObject>();
    }

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

    @Override
    public void printShapeList() {
        for(int i=0; i < shapeList.size(); i++){
            if(shapeList.get(i).getShape().equals("Circle")){
                System.out.println("Shape = Circle, Area = " + shapeList.get(i).getArea() + ", Perimeter = " + shapeList.get(i).getPerimeter());
            } else if (shapeList.get(i).getShape().equals("Square")) {
                System.out.println("Shape = Square, Area = " + shapeList.get(i).getArea() + ", Perimeter = " + shapeList.get(i).getPerimeter());
            }else{
                System.out.println("Shape = Rectangle, Area = " + shapeList.get(i).getArea() + ", Perimeter = " + shapeList.get(i).getPerimeter());
            }
        }
    }

    @Override
    public boolean runMenu() {
        boolean exit = false;
        System.out.println("1. To Add a new shape press 1");
        System.out.println("2. To print the list of the shapes press 2");
        System.out.println("3. To exit press 3");
        System.out.print("Enter your choice : ");
        Scanner s = new Scanner (System.in);
        int choice = s.nextInt();
        switch(choice){
            case 1:
                System.out.println("Press 1 if you want to add a Circle");
                System.out.println("Press 2 if you want to add a Rectangle");
                System.out.println("Press 3 if you want to add a Square");
                System.out.print("Enter your desired object : ");

                int choice2 = s.nextInt();
//                s.nextLine();

                System.out.print("Enter the color of your shape : ");
                String colour = s.next();

                System.out.print("Is it filled? (y/n) : ");
                String isFilled = s.next();
                boolean filled = false;

                if (isFilled.equals("y")) filled = true;
                else if (isFilled.equals("n")) filled = false;
                else
                System.out.println("Please enter y or n, if the shape is filled or not respectively");
                switch (choice2){
                    case 1:
                        // its a circle
                        System.out.print("Insert the radius : ");
                        int radius = s.nextInt();
                        Circle circle = new Circle(radius, colour, filled);
                        this.addShape(circle);
                        break;
                    case 2:
                        // TODO - write here the code if the rectangle is selected
                        // its a rectangle
                        System.out.print("Insert the length :");
                        int length = s.nextInt();
                        System.out.print("Insert the width :");
                        int width = s.nextInt();
                        Rectangle rectangle = new Rectangle(length, width, colour, filled);
                        this.addShape(rectangle);
                        break;
                    case 3:
                        // TODO - write here the code if the square is selected
                        // its a square
                        System.out.print("Insert the side :");
                        int side = s.nextInt();
                        Square square = new Square(side, colour, filled);
                        this.addShape(square);
                        break;
                }
                break;
            case 2:
                this.printShapeList();
                break;
            case 3:
                exit = true;
                break;
        }
        return exit;
    }
}