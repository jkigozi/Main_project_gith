import java.util.*;

public class test_generic {


	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		Integer[] iray = {1,2,3,4};
		String[] sray = {"one", "tow", "three", "four"};
		Character[] cray = {'c', 'h', 'e', 'e', 'r'};
		
		List<Integer> list1 = Arrays.asList(iray);
		List<String> list = Arrays.asList(sray);
		
		printme(cray);
		printme(iray);
		printme(list1);
		printme(list);
		
		long end = System.currentTimeMillis();
		System.out.printf("This took %s", end -start + " milliseconds");

	}
	
	//generic method for lists of all types
	
	public static <T> void printme(T x){
		//for (T i : x)
			System.out.printf("%s ", x);
			System.out.println();
		
	}
	
	
	//generic method for arrays of all types
	public static <T> void printme(T[] x){
		for (T i : x)
			System.out.printf("%s ", i);
			System.out.println();
		
	}

}
