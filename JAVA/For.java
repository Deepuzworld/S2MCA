import java.util.Scanner;


Public class For{
	public static void main(String[] arg){
		Scanner taa=new Scanner(System.in);
		System.out.printf("Enter the limit:");
		int val= taa.nextInt();
		
		for(int i=1; i<=val; ++i){
			System.out.println(i);
		}
	}
}
