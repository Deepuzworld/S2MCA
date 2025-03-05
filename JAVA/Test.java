class Test{
	int sum(int a, int b){
		return(a+b);
	}
	
	int sum(int a, int b, int c){
		return(a+b+c);
	}
	
	double sum(double a, double b){
		return(a+b);
	}
	
	public static void main(String[] arg){
		Test obj=new Test();
		System.out.println(obj.sum(10,46));
		System.out.println(obj.sum(23,45,67));
		System.out.println(obj.sum(23.65,98.97));
	}
}
