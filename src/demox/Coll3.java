package demox;

import java.util.Collections;
import java.util.LinkedList;

public class Coll3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al=new LinkedList<String>();//Collection with generics <>
		//type safety
		al.add("AJay");//0
		al.add("Aditya");//1
		al.add("Syamala");//2
		al.add(0,"Sri");
		al.add("Sri");
		al.set(1, "Adi");
		//Collection is an interface
		//Collections is a class
		//LinkedList implements List interface
		//List interface extends Collection interface
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		
		
		
		
		
	}

}
