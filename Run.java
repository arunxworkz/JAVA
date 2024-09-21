//Compile time ploymorphism (Function over loading  )

class Music{

	void method(){
		System.out.println("This is from music class");
	}
}

class CarnaticMusic extends Music{
	
	void method(){ // overiding the method
		System.out.println("This is from CarnaticMusic class");
	}		
}

class HindustaniMusic extends Music{

		void method(){
			System.out.println("This is from HindustaniMusic");
		}
}

class People{
	
		void dance(Music music){
			System.out.println("This will be for dancing");
			music.method();
		}
		
		void dance(CarnaticMusic carnaticMusic){
			System.out.println("Thhis for singing");
			carnaticMusic.method();
		}
		
		void dance(HindustaniMusic hindustaniMusic){
			System.out.println("This is singers");
			hindustaniMusic.method();
		}
		
}

class Run{
	public static void main(String[] args){
		
		Music music = new Music();
		CarnaticMusic carnaticMusic = new CarnaticMusic();
		HindustaniMusic hindustaniMusic = new HindustaniMusic();
		
		People people = new People();
		people.dance(music);
		people.dance(carnaticMusic);
		people.dance(hindustaniMusic);
		
		
		
	}
}
