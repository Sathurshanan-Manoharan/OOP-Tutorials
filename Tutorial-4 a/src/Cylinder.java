public class Cylinder extends Circle{
    private double height = 1.00;

    public Cylinder (){
        super();
        height = 1.00;
    }
    public Cylinder (double height){
        super();
        this.height = height;
    }
    public Cylinder (double radius, double height){
        super(radius);
        this.height = height;
    }

    public Cylinder (double radius, double height ,String color){
        super(radius,color);
        this.height = height;
    }

    public double getHeight(){

        return this.height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * getHeight() + 2 * (2 * getRadius() * Math.PI);
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        double volume = getArea()*height;
        return volume;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString()+ " height=" + height;
    }
}