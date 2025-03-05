class Car{
	String brand;
	int year;
	
	public Car(String brand, int year){
		this.brand = brand;
		this.year = year;
	}
	
	public void Dis(){
		System.out.println("Car brand: "+ brand);
		System.out.println("Year of manufactured in: "+ year +"\n");
	}
	
	public static void main(String [] arg){
		Car car1= new Car("Toyota",2015);
		Car car2=new Car("Honda", 2020);
		Car car3=new Car("Ford", 2018);
			
		System.out.println("Details of  car 1");
		car1.Dis();
			
		System.out.println("Details of car 2");
		car2.Dis();
			
		System.out.println("Details of  car 3");
		car3.Dis();
	}
}
