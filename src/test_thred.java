import java.util.*;
public class test_thred {


	public static void main(String[] args) {
		
		Thread t1 = new Thread(new test_thred_sub("one"));
		Thread t2 = new Thread(new test_thred_sub("two"));
		Thread t3 = new Thread(new test_thred_sub("three"));
		
		t1.start();
		t2.start();
		t3.start();

	}
	
	
				
	

}
