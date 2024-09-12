import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;


class FileReading{
	
	/*static void method(File file){
		
		//File file = new File("C:\\Users\\arunb\\OneDrive\\Desktop\\3 types of reading the file.txt");
		try{
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str;
			while((str = br.readLine()) != null){
				System.out.println(str);
			}
			br.close();
		}catch (IOException e){
			e.printStackTrace();
		}
	}*/
	
	
	
	public static void main(String[] args) throws FileNotFoundException{
		
		//File file = new File("C:\\Users\\arunb\\OneDrive\\Desktop\\File.txt");
		
		//BufferReader br = new BufferReader(new FileReader(file));
		
		//String str;

			File file = new File("C:\\Users\\arunb\\OneDrive\\Desktop\\File.txt");
			
			Scanner sc = new Scanner(file);
			
			
			while(sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}
			
		//	File file1 = new File("C:\\Users\\arunb\\OneDrive\\Desktop\\3 types of reading the file.txt");
		//	method(file1);
		
	}
	
	
	
	
}