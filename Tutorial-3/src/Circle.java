public class Circle {
    private double radius = 1.0;
    private String colour = "Blue";

    Circle(){

    }
    Circle(double r){
        this.radius = r;
    }

    Circle(double r, String colour){
        this.radius = r;
        this.colour = colour;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
}
