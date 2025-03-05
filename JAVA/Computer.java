public class Computer{
	static class Cpu{
		int price;
		Cpu(int price){
			this.price =price;
		}
		void disp(){
			System.out.println("\nCPU Price: " + price);
		}
	}
	
	static class Processor {
		int cores;
		String manufacturer;
		Processor(int cores, String manufacturer){
			this.cores=cores;
			this.manufacturer = manufacturer;
		}
		
		void disp(){
			System.out.println("Processor Cores: " +  cores);
			System.out.println("Procosser Manufacturer: " + manufacturer);
		}
	}
	
	static class Ram{
		int memory;
		String manufacturer;
		
		Ram(int memory, String manufacturer){
			this.memory = memory ;
			this.manufacturer = manufacturer;
		}
		
		void disp(){
			System.out.println("RAM Size: " + memory + "MB");
			System.out.println("RAM Manufacturer: " + manufacturer + "\n");
		}
	}
	
	public static void main(String[] args){
		Cpu cpu = new Cpu(23000);
		Processor pro = new Processor(4, "Intel" );
		Ram ram = new Ram(1024, "Asus"); 
		
		cpu.disp();
		pro.disp();
		ram.disp();
	}
}
