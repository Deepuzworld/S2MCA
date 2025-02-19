import java.util.Scanner;

public class HdoWhile{
	public static void main(String[] arg){
		int i=1;
		Scanner tha= new Scanner(System.in);
		System.out.printf("Enter the limit:");
		int val=tha.nextInt();
	
		do{
		 System.out.println("Hallo world");
		 i++;
		}
		while(i<=val);
	}
}
