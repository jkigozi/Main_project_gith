import java.io.*;
public class test_readfile_bychar {


	public static void main(String[] args){
		File f = new File("C:\\New_64\\xxx.tx");
		
		try {
		FileReader fr = new FileReader(f);
		
		int ch = fr.read();
		
		
			while (ch != -1){
			System.out.print((char) ch);
			ch = fr.read();
		} 
		} catch (IOException ex){
			
		}
		 

	}

}
