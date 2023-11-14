public class Circle {
    private double radius = 1;
    private String color = "Blue";

    public Circle(){
        this.radius = 1;
        this.color = "Blue";
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    public String getColor(){
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


