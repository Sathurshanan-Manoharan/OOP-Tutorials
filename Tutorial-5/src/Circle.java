public class Circle extends GeometricObject{
        protected double radius; //radius attribute for circle

        //Default constructor
        public Circle(){
        }

        //constructor with radius as parameter
        public Circle(double radius){
                this.radius = radius;
        }

        //Constructor with three parameters
        public Circle(double radius,String colour, boolean filled){
                super(filled, colour);
                this.radius = radius;
        }

        //Method to set the radius of the Circle
        public void setRadius(double radius) {
                this.radius = radius;
        }

        //Method to retrieve the radius
        public double getRadius() {
                return radius;
        }

        //Overridden method to get the area of the shape
        @Override
        public double getArea() {
                return (22/7) * radius * radius;
        }

        //Overridden method to get the perimeter of the shape
        @Override
        public double getPerimeter() {
                return 2 * (22/7) * radius;
        }

        //Overridden method to get the shape of the shape
        @Override
        public String getShape() {
                return "Circle";
        }

        @Override
        public String toString() {
                return "Circle{" +
                        "radius=" + radius +
                        ", filled=" + filled +
                        ", colour='" + colour + '\'' +
                        '}';
        }
}
