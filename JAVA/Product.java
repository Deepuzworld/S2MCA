public class Product{
	String pcode;
	String pname;
	int price;
	
	public Product(String pecode_get, String pname_get, int price_get ){
		pcode = pecode_get;
		pname = pname_get;
		price = price_get;
	}
	
	public int getProduct(){
		return price;
	}
	
	public static void main(String[] args){
		Product p1 = new Product("A123", "TV", 2);
		Product p2 = new Product("B123", "RADIO", 21);
		Product p3 = new Product("C123", "DVD", 3);
		
		Product lowestPriceProduct = p1;
		
		if(p2.price < lowestPriceProduct.price){
			lowestPriceProduct = p2;
		}
		if(p3.price < lowestPriceProduct.price){
			lowestPriceProduct = p3;
		}
		System.out.println("Lowest product ID is: " + lowestPriceProduct.pcode);
	}
} 
