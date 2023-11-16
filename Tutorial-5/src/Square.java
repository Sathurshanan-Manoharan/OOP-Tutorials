public class Square extends GeometricObject{
    protected double side; //side attribute for circle

    //Default constructor
    public Square(){
    }

    //Constructor with side as a parameter
    public Square(double side){
        this.side = side;
    }

    //Constructor with three parameters
    public Square(double side, String colour, boolean filled){
        super(filled, colour);
        this.side = side;
    }

    //Method to get the side of the shape
    public double getSide() {
        return side;
    }

    //Method to set the side of the shape
    public void setSide(double side) {
        this.side = side;
    }

    //Overridden method to get the shape of the shape
    @Override
    public String getShape() {
        return "Square";
    }

    //Overridden method to get the area of the shape
    @Override
    public double getArea() {
        return side * side;
    }

    //Overidden method to get the perimeter of the shape sqaure
    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", filled=" + filled +
                ", colour='" + colour + '\'' +
                '}';
    }
}
