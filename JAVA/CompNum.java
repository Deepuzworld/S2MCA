import java.util.Scanner;

public class CompNum{
	public static void main(String[] arg){
	
		Scanner thaa = new Scanner(System.in);
		
		System.out.println("Number: ");
		int a = thaa.nextInt();
		
		
		if(a>0){
			System.out.println("+ve Number");
		}
		else if(a==0){
			System.out.println("Number is 0");
		}
		else{
			System.out.println("-ve Number");
		}

	}
}
