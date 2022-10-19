public class Circle {
    private double radius = 1.0;
    private String color = "red";


    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double Area() {
          double area = radius * radius * 3.14 ;
          return area;
    }
    public void display(){
        System.out.println(Area());
    }
}
