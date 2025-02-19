import java.util.Scanner;

public class Loop{
	public static void main(String[] arg){
	
	Scanner tha= new Scanner(System.in);
	System.out.printf("Enter the limit: ");
	int val = tha.nextInt();
	int i=1;
	
	while(i<=val){
		System.out.println(i);
		i++;
	}
	}
}
