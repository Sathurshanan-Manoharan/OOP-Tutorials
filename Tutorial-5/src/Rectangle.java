public class Rectangle extends GeometricObject{
    protected double length; //length attribute for circle
    protected double width; //width attribute for circle

    //Default constructor
    public Rectangle(){
    }

    //Constructor with two parameters
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    //Constructor with four parameters
    public Rectangle(double length, double width, String colour,boolean filled){
        super(filled, colour);
        this.length = length;
        this.width = width;
    }

    //Method to get the length of the shape
    public double getLength() {
        return length;
    }

    //Method to set the length of the shape
    public void setLength(double length) {
        this.length = length;
    }

    //Method to get the width of the shape
    public double getWidth() {
        return width;
    }

    //Method to set the width of the shape
    public void setWidth(double width) {
        this.width = width;
    }

    //Overridden method to get the shape of the shape
    @Override
    public String getShape() {
        return "Rectangle";
    }

    //Overridden method to get the area of the shape
    @Override
    public double getArea() {
        return length * width;
    }

    //Overridden method to get the perimeter of the shape
    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", filled=" + filled +
                ", colour='" + colour + '\'' +
                '}';
    }
}
