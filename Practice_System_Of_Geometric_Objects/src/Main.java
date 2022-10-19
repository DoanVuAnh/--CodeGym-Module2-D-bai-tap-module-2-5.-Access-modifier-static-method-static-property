import javafx.scene.shape.Circle;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);


        CircleByCircle circleByCircle = new CircleByCircle();
         circleByCircle = new CircleByCircle(3.5);
         System.out.println(circleByCircle);

         circleByCircle = new CircleByCircle(3.2,"ble",false);
         System.out.println(circleByCircle);

         RectangleByRectangle rectangleByRectangle = new RectangleByRectangle();
         rectangleByRectangle = new RectangleByRectangle(3,10);
         System.out.println(rectangleByRectangle);

         rectangleByRectangle = new RectangleByRectangle(2,10,"blu",true);
         System.out.println(rectangleByRectangle);

         SquareBySquare squareBySquare = new SquareBySquare();
         System.out.println(squareBySquare);
         squareBySquare = new SquareBySquare(2.3);
         System.out.println(squareBySquare);
         squareBySquare = new SquareBySquare(5.2,"Yellow",true);
         System.out.println(squareBySquare);
    }
}