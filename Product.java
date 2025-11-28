


/*


Bonus Scenario: Create a class Product with two private data members: name and stock.
● Add a constructor to initialize these values.
● Add a method buyOne that decreases stock if available; otherwise prints "Out of
stock".
● If the entered product does not exist, print "No such product!".
● Add a method printInfo that shows the product name and remaining stock.
In a separate class ProductDemo:
1. Ask the user how many products the store has and create an array of products with
that size.
2. Use a loop to fill the array by asking the user for each product’s name and stock.
3. Create a loop where the user can type a product name to buy it, or "Q" to quit.
○ Buying decreases stock by one, if available.
○ If there is no remaining selected product in the stock, print “Out of stock!”.
4. Attempt to buy a product again that is out of stock.
5. After the user quits, call the printInfo method for all products.
*/
public class Product {
    private String name;
    private int stock;

    public Product(String name, int stock){
        this.name=name;
        this.stock=stock;
    }
    public void buyOne(){
        if (stock>0) {
            stock--;
            
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("Bought the product "+name);
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");

        }else{
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");

            System.out.println("OUT OF STOCK!!");

            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");

        }
    }
    public void printInfo(){
        System.out.println("Product name = "+name);
        System.out.println("Product stock = "+stock);

    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void  setCount(int count){
        this.stock=count;
    }
    public int getCount(){
        return stock;
    }
}
