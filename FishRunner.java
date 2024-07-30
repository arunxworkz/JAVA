class Fish{
	
	String name;
	String species;
	
	Fish(String nameLocal, String speciesLoacl){
		
		/*System.out.println("The name of the fish is: "+nameLocal);
		System.out.println("The species of the fish is: "+speciesLoacl);*/
		name = nameLocal;
		species = speciesLoacl;
		System.out.println("The name of the fish is: "+name);
		System.out.println("The species of the fish is: "+species);
	}
}


class FishRunner{
	
	public static void main(String[] args){
		
		Fish fish = new Fish("Nemo" , "clownfish"); // instances - parametrized constructor
		Fish fish1 = new Fish("Dory", "Blue Tang");
		fish =  fish1;
		System.out.println("After assigning the fish1 to fish: "+fish.name+ " " + fish.species);
		Fish fish2 = new Fish("Marlin", "Clownfish");
		Fish fish3 = new Fish("Bruce","Great White Shark");
		Fish fish4 = new Fish("Gill", "Moorish Idol");
		Fish fish5 = new Fish("Bubbles", "Yellow Tang");
		Fish fish6 = new Fish("Peach", "Starfish");
		Fish fish7 = new Fish("Flo", "Damselfish");
		Fish fish8 = new Fish("Jacques", "Cleaner Shrimp");
		Fish fish9 = new Fish("Crush", "Sea Turtle");
		Fish fish10 = new Fish("Squirt", "Sea Turtle");
	}
	
}