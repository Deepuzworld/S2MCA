import java.util.Scanner;

public class doWhile{
	public static void main(String[] arg){
		int i=1;
		Scanner tha= new Scanner(System.in);
		System.out.printf("Enter the limit:");
		int val=tha.nextInt();
	
		do{
		 System.out.println(i);
		 i++;
		}
		while(i<=val);
	}
}
