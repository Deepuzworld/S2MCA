import java.util.Scanner;

public class TypCast{
	public static void main(String[] arg){
		
		Scanner thaaa= new Scanner(System.in);
		System.out.printf("Enter a String:");
		String a=thaaa.nextLine();
		
		System.out.println("Upper: "+a.toUpperCase());
		System.out.println("Lower: "+a.toLowerCase());
	}
}
