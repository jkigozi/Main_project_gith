import java.io.*;
import java.util.*;

public class ReadWriteTextFileWithEncoding {
	
	public static void main(String... aArgs) throws IOException {
		String fileName = aArgs[0];
		String encoding = aArgs[1];
		
		
		/*String fileName = "C:\\New_64\\xxx.txt";
		String encoding = "UTF-8";
		*/
		
		ReadWriteTextFileWithEncoding test = new ReadWriteTextFileWithEncoding(fileName, encoding);
		
		test.write();
		test.read();
	}
		
		
		
		ReadWriteTextFileWithEncoding(String aFileName, String aEncoding){
			fFileName = aFileName;
			fEncoding = aEncoding;
		}
		
	void write() throws IOException {
		log("Writing to file named "+ fFileName + " . Encoding: "+ fEncoding );
		Writer out = new OutputStreamWriter(new FileOutputStream(fFileName),fEncoding);
		
		try {
			out.write(FIXED_TEXT);
			
		}
			finally {
				out.close();
			}
	}
	
	void read() throws IOException {
		log("Reading from File ");
		StringBuilder text = new StringBuilder();
		String NL = System.getProperty("line.separator");
		Scanner scanner = new Scanner(new FileInputStream(fFileName),fEncoding);
		
		try {
			while (scanner.hasNextLine()) {
				text.append(scanner.nextLine() +NL);
			}
		}
	 finally {
		scanner.close();
	}
	
	log("Text read in: " + text);
	
	}
	
	private final String fFileName;
	private final String fEncoding;	
	private final String FIXED_TEXT = "hehehehehehe";
	
	private void log(String aMessage) {
		System.out.println(aMessage);
	}

}
