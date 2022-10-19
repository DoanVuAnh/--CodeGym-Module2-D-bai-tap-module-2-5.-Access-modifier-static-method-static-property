
import java.util.Scanner;

public class ProductManager {
    static int count =0;
    public Product[] product = new Product[3];
    public void addProduct(){
        Scanner input = new Scanner(System.in);

        System.out.print("Add Product: ");
        String name = input.nextLine();

        System.out.print("Add Price: ");
        int price = input.nextInt();

        System.out.print("Description: ");
        String description = input.nextLine();

        product[count] = new Product(name, price, description);
        count ++;

    }
    public void display(){
        System.out.println("List Product:");
        for(int i = 0; i < product.length; i++){
            System.out.print(product[i]);
        }

    }

    public void deleteProduct(){
        System.out.println("Delete Product: ");
        int index = Integer.parseInt()
    }

}

