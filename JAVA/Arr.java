import java.util.Arrays;

public class Arr{
	public static void main(String[] arg){
		String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
		System.out.println(Arrays.toString(fruits));
		System.out.println();
		
		for(String i : fruits){
			System.out.println(i);
		}
	}
}
