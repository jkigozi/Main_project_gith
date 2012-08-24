import java.util.*;

public class test_collect {


	public static void main(String[] args) {
		// convert stuff array to a list
		String[] stuff = {"one", "two", "three", "one", "four", "five"};
		List<String> list1 = Arrays.asList(stuff);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("one-1");
		list2.add("two-2");
		list2.add("three-3");
		//list2.add("three");
		
		Set<String> set = new HashSet<String>(list1);
		
		for(String xx : list2)
			System.out.printf("%s\n", xx);
		
		Collections.addAll(list2, stuff);
		
		System.out.println();
		
		for(String xx : list2)
			System.out.printf("%s ", xx);
		
		
		//checks how many times item appears
		System.out.println();
		System.out.println(Collections.frequency(list2, "one"));
		
		boolean tof = Collections.disjoint(list1, list2);
		
		System.out.println(tof);
		
			
		if (tof){
			System.out.println("list1 and list2 hav nothing in common");
		} else {
			System.out.println("list1 and list2 hav  something in common");
		}
		
		System.out.printf("%s ", set);
				
		
		
		

	}

}
