public class Rectangle extends GeometricObject{
    protected double length;
    protected double width;

    public Rectangle(){
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, String colour,boolean filled){
        super(filled, colour);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String getShape() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getParameter() {
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
