import java.util.Scanner;

public class AddNum{
	public static void main(String[] arg){
	
		Scanner thaa = new Scanner(System.in);
		
		System.out.printf("Enter 1st Num: ");
		int a= thaa.nextInt();
		
		System.out.printf("Enter 2nd Num: ");
		int b= thaa.nextInt();
		
		int sum= a+b;
		System.out.printf("The Sum of %d and %d : %d\n",a,b,sum);
		
	}
}
