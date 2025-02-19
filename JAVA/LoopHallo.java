import java.util.Scanner;

public class LoopHallo{
	public static void main(String[] arg){
	
	Scanner tha= new Scanner(System.in);
	System.out.printf("Ennter the Limit: ");
	int val=tha.nextInt();
	
	int i=1;
	while(i<=val){
		System.out.println("Hallo");
		i++;
	}
	}
}
