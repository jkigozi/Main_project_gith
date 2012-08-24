import java.util.*;

public class test_generic_1 {


	public static void main(String[] args) {
		Integer[] iray = {1,2,3,4};
		String[] sray = {"one", "tow", "three", "four"};
		
		List<String> list = Arrays.asList(sray);
		
		printme(iray);
		printme(list);

	}
	
	private static void printme(Integer[] i){
		for (Integer x : i)
			System.out.printf("%s ", x);
			System.out.println();
		
	}
	
	private static void printme(List<String> s){
		for (String x : s)
			System.out.printf("%s ", x);
			System.out.println();
		
	}

}
