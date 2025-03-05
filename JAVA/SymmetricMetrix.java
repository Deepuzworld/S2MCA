import java.util.*;

public class SymmetricMetrix{
	int row, column;
	int[][] array;
	
	public void getMatrix() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:  ");
		this.row = sc.nextInt();
		System.out.println("Enter number of columns: ");
		this.column = sc.nextInt();
		array = new int[row][column];
		
		System.out.println("Enter matrix elements: ");
		for(int rc=0; rc<row; rc++ ){
			for(int cc=0; cc<column; cc++){
				array[rc][cc]= sc.nextInt();
			}
		}
	}
	
	public void isSymmetric() {
		if(row !=  column){
			System.out.println("Not symetric !  \nMetrix is not square :(");
			return;
		}
		
		for(int rc = 0; rc<row; rc++){
			for (int cc= rc+1; cc < column; cc++){
				if (array[rc][cc] != array[cc][rc]){
					System.out.println("Not Symmetric !");
					return;
				}
			} 
		}
		System.out.println("Symetric :)");
	}
	
	public static void main(String[] args) {
	        Matrix matrix = new Matrix();
	        matrix.getMatrix();
	        matrix.isSymmetric();
	        System.out.println("......END.......");
    }
}




/*rc to rowIndex: Replaced rc with rowIndex, which better indicates that it represents the current row of the matrix.

cc to columnIndex: Replaced cc with columnIndex, making it clear that it refers to the current column of the matrix.*/

