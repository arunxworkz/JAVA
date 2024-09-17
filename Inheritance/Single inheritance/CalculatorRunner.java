class CalculatorRunner{
	
	public static void main(String[] args){
		ScientificCalculator sc = new ScientificCalculator(283, "Large calculations");
		sc.display();
		sc.method("10");
		
		System.out.println("------------------------------------------------");
		
		Calculator c = new ScientificCalculator(250, "Large");
		c.method("Small quantity");
		//c.display(); this can not be done
	}
	
	
	
}