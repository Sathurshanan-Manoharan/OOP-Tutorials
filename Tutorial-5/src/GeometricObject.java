import com.sun.nio.sctp.AbstractNotificationHandler;

public abstract class GeometricObject {
    protected boolean filled;
    protected String colour;

    //Default constructor
    public GeometricObject(){
    }

    //Construct with all the attributes
    public GeometricObject(boolean filled, String colour){
        this.filled = filled;
        this.colour = colour;
    }

    /**
     * Method to get the colour of the shape
     * @return
     */
    public String getColour(){
        return colour;
    }

    /**
     * Method to set the colour of the shape
     * @param colour
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * Method that returns a boolean to show whether the shape is filled or not
     * @return
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Method to set a boolean to decide whether the shape is filled or not
     * @param filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //An abstract method to get the perimeter of the shape
    public abstract double getPerimeter();

    //An abstract method to get the area of the shape
    public abstract double getArea();

    //An abstract method to get the shape
    public abstract String getShape();

    //Method that is overridden to convert the attribute as a string to display
    @Override
    public String toString() {
        return "GeometricObject{" +
                "filled = " + filled +
                ", colour = " + colour + '\'' +
                '}';
    }
}
