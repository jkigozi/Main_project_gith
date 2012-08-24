import java.util.*;

public class test_stak {


	public static void main(String[] args) {

		Stack<String> stk = new Stack<String>();
		stk.push("bottom");
		printstack(stk);
		stk.push("middle");
		printstack(stk);
		stk.push("top");
		printstack(stk);
			
		stk.pop();
		printstack(stk);
		//stk.pop();
		printstack(stk);
		//stk.pop();
		printstack(stk);
		
		PriorityQueue<String> q = new PriorityQueue<String>();
		
		q.offer("first");
		q.offer("two");
		q.offer("three");
		
		System.out.printf("%s ", q);
		System.out.println();
		
		System.out.printf("%s ", q.peek());
		System.out.println();
		
		q.poll();
		
		System.out.printf("%s ", q);
		System.out.println();
		
		
	}
	
	private static void printstack(Stack<String> s){
		if (s.isEmpty()){
			System.out.println("You have nothing in stack");
		} else {
			System.out.printf("%s TOP\n", s);
		}
	}

}
