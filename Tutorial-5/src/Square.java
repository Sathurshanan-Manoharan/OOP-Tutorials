public class Square extends GeometricObject{
    protected double side;

    //Default constructor
    public Square(){
    }

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String colour, boolean filled){
        super(filled, colour);
        this.side = side;
    }


    @Override
    public String getShape() {
        return "Square";
    }

    @Override
    public double getArea() {
        return side * side;
    }

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
