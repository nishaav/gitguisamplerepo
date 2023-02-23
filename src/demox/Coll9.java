package demox;

import java.util.*;
public class Coll9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FILO: First In Last Out 
		//LIFO: Last In First Out
		Stack<String> stack=new Stack<>();
		stack.add("Dhanesh");
		stack.add("Aditya");
		stack.add("Syamala");
		stack.add("Srikanth");
		
		System.out.println(stack);
		System.out.println(stack.capacity());
		System.out.println(stack.contains("Nisha"));
		System.out.println(stack.empty());
		System.out.println(stack.firstElement());
		System.out.println(stack.lastElement());
		System.out.println(stack.get(2));
		System.out.println(stack.peek());
		System.out.println(stack.push("Rahul"));
		System.out.println(stack.pop());
		System.out.println(stack.search("Rahul"));
		System.out.println(stack.remove("Adi"));//object 
		System.out.println(stack);
		stack.add(3,"Pratik");
		System.out.println(stack);
		stack.remove(2);System.out.println(stack);
		System.out.println(stack.push("Rahul"));
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
	}
}





