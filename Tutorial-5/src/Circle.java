public class Circle extends GeometricObject{
        protected double radius; //radius attribute for circle

        //Default constructor
        public Circle(){
        }

        //constructor with radius as parameter
        public Circle(double radius){
                this.radius = radius;
        }

        public Circle(double radius,String colour, boolean filled){
                super(filled, colour);
                this.radius = radius;
        }

        public void setRadius(double radius) {
                this.radius = radius;
        }

        public double getRadius() {
                return radius;
        }

        @Override
        public double getArea() {
                return (22/7) * radius * radius;
        }

        @Override
        public double getPerimeter() {
                return 2 * (22/7) * radius;
        }

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
