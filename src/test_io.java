import java.io.BufferedReader;
import java.io.*;


public class test_io {
	
		
	
	public static void main(String[] args) {
		try {
			FileReader someFile = new FileReader("C:\\New_64\\xxxx.txt");
			
			BufferedReader input = new BufferedReader(someFile);
			
			String line = new String();
			while (true) {
				
				line = input.readLine();
				if (line == null) {
					System.exit(0);
				}
				else {
					System.out.println(line);
				}
			}
		} 
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch (IOException e) {
			e.printStackTrace();
			
		}
	}
}
