

/*In a separate class ProductDemo:
1. Ask the user how many products the store has and create an array of products with
that size.
2. Use a loop to fill the array by asking the user for each product’s name and stock.
3. Create a loop where the user can type a product name to buy it, or "Q" to quit.
○ Buying decreases stock by one, if available.
○ If there is no remaining selected product in the stock, print “Out of stock!”.
4. Attempt to buy a product again that is out of stock.
5. After the user quits, call the printInfo method for all products. */
import java.util.Scanner;
public class ProducDemo {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Give us the count of product types in store");
        System.out.println("(POSITIVE INTEGER)");

        int productCount=sc.nextInt();

        if (productCount>0) {
            Product[] products=new Product[productCount];
            
            
            for (int i = 0; i < productCount; i++) {
                products[i]=new Product("NULL",0);
                sc.nextLine();
                System.out.println("Name:");
                String name=sc.nextLine();
                System.out.println("Count:");
                int count= sc.nextInt();
                products[i].setName(name);
                products[i].setCount(count);
                products[i].printInfo();

            }

            System.out.println("Changing mode to shopping!!!");
            sc.nextLine();
            while (true) { 

                System.out.println("give the name of the product you desire to buy.");
                System.out.println("Type q to exit the loop");

                String prodName=sc.nextLine();
                if (prodName.equals("q")||prodName.equals("Q")) {
                    
                    System.out.println("Okay, exiting shopping.");

                    break;

                }
                for (int i = 0; i < products.length; i++) {
                    if (prodName.equals(products[i].getName())) {
                        
                        products[i].buyOne();
                        break;
                    }                    
                }
            }

            for (int i = 0; i < products.length; i++) {
                
                products[i].printInfo();

            }

        }else{
            System.out.println("This ain't positive integer, bye.");
        }
    }



}
