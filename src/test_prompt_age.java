import java.io.*;

public class test_prompt_age {

	public static void main(String[] args) throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("What is your name? ");
		String name = br.readLine();
		
		
		System.out.println("What year were you born?");
		String byr = br.readLine();
		
		
		System.out.println("What is current year?");
		String cyr = br.readLine();
		
		int byr_int = Integer.parseInt(byr);
		int cyr_int = Integer.parseInt(cyr);
		
		int age = cyr_int -byr_int;
		
		System.out.println("Hey "+name+ ", you are gonna be "+age+ " years old this year");
		

	}

}
