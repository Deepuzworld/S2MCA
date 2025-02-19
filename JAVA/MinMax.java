import java.util.Scanner;

public class MinMax{
	public static void main(String[] arg){
		
		Scanner thaaa= new Scanner(System.in);
		System.out.printf("Enter 1st val:");
		int a=thaaa.nextInt();
		
		System.out.printf("Enter 2nd val:");
		int b=thaaa.nextInt();
		System.out.println();
		
		int maxVal=Math.max(a,b);
		int minVal=Math.min(a,b);
		
		System.out.println("Maximum of "+a+" & "+b+" :"+maxVal);
		System.out.println("Minimum of "+a+" & "+b+" :"+minVal);
	}
}
