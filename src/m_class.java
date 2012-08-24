import java.io.*;


public class m_class {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
		File zfile = new File("C:\\New_64\\xxx.txt");
		
		File ifile = new File("C:\\New_64\\config_standalone.txt");
		
		//String filename = zfile.getName();
		String in_file = ifile.getName();
		
		BufferedReader inp = new BufferedReader(new FileReader(ifile)); 
		
		BufferedWriter outp = new BufferedWriter(new FileWriter(zfile));
		
		
		
		outp.write(in_file);
		outp.close();
		inp.close();


	}

}
