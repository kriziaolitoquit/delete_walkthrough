public class App {
    public static void main(String[] args) throws Exception {
        double price = 23.00;
	    double discount = .10;
	   price = (1 - discount) * price;
	   System.out.println("With discount the price is " +  price);
    }
}
