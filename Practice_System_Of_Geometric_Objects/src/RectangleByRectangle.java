public class RectangleByRectangle extends Shape{
    private  double width = 1.0;
    private double length = 2.0;

    public RectangleByRectangle(){
    }

    public RectangleByRectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public RectangleByRectangle(double width,double length, String color, boolean filled){
        super(color, filled);
        this.width =width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width= "
                + getWidth()
                + " and length= "
                + getLength()
                + " Area: "
                +getArea()
                + " Perimeter: "
                +getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }
}
