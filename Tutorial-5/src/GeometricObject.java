import com.sun.nio.sctp.AbstractNotificationHandler;

public abstract class GeometricObject {
    protected boolean filled;
    protected String colour;

    public GeometricObject(){
    }

    public GeometricObject(boolean filled, String colour){
        this.filled = filled;
        this.colour = colour;
    }
    public String getColour(){
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getParameter();
    public abstract double getArea();
    public abstract String getShape();

    @Override
    public String toString() {
        return "GeometricObject{" +
                "filled = " + filled +
                ", colour = " + colour + '\'' +
                '}';
    }
}
