public class Complex{
	int real;
	int imaginary;
	
	public Complex(int real, int imaginary){
		this.real = real;
		this.imaginary = imaginary; 
	}
	
	public Complex add(Complex other){
		return new Complex(this.real + other.real, this.imaginary + other.imaginary);
	}
	
	public static void main(String[] args){
		Complex fir = new Complex(23,45);
		Complex sec = new Complex(34,2);
		
		Complex resl = fir.add(sec);
		System.out.println("Sum is: " + resl.real + "+" + resl.imaginary +  "i");
	}
}
