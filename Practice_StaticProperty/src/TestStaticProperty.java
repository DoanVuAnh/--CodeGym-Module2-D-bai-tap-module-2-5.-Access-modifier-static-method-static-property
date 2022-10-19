public class TestStaticProperty {
    public static void main(String[] args) {

         Car car1 = new Car("Mazda 3","Skyacticv 3");
         Car car2 = new Car("Mazda 6","Skyacticv 6");
         Car car3 = new Car("Mazda 7","Skyacticv 7");
         Car car4 = new Car("Mazda 7","Skyacticv 7");

        System.out.println(Car.numberOfCars);
    }
}
