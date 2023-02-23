package demox;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Coll4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Duplicacy is not allowed in set implementing classes
		
		/*
		 * LinkedHashSet : insertion order
		 * TreeSet
		 * HashSet
		 */
		
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("Aditya");
		lhs.add("aditya");
		lhs.add("Megha");
		lhs.add("Priya");
		lhs.add("Abhishek");
		lhs.add("Anup");
		lhs.add("Sanjay");
		lhs.add("Seema");
		System.out.println(lhs);
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.size());
		
		System.out.println(lhs.remove("aditya"));
		
		//Different ways of printing the collection
		//option 1
		System.out.println(lhs);
		//option 2
		for(String str:lhs)
		{
			System.out.println(str);
		}
		//option 3
		//using for loop but not in case of set as it does not have get method
		LinkedList<String> ll=new LinkedList<String>(lhs);
		
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		
		//option 4
		//using Iterator interface
		
		Iterator<String> itr=lhs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
