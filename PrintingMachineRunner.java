class PrintingMachine{
	
	String brand;
	double price;
	
	PrintingMachine(String brandLocal, double priceLocal){
		
		brand = brandLocal;
		price = priceLocal;
		System.out.println("The brand is: "+brand);
		System.out.println("The price is: "+price);
	}
	
	
}

class PrintingMachineRunner{
	
	public static void main(String[] args){
		
		PrintingMachine machine = new PrintingMachine("HP", 50000);
		PrintingMachine machine1 = new PrintingMachine("Canon", 40000);
		PrintingMachine machine2 = new PrintingMachine("Epson", 45000);
		PrintingMachine machine3 = new PrintingMachine("Brother", 60000);
		PrintingMachine machine4 = new PrintingMachine("Dell", 35000);
		PrintingMachine machine5 = new PrintingMachine("Samsung", 48000);
		PrintingMachine machine6 = new PrintingMachine("Xerox", 30000);
		PrintingMachine machine7 = new PrintingMachine("Kyocera", 25000);
		PrintingMachine machine8 = new PrintingMachine("Ricoh", 100000);
		PrintingMachine machine9 = new PrintingMachine("Lexmark", 70000);
		PrintingMachine machine10 = new PrintingMachine("Acer", 85000);
		
	}
}