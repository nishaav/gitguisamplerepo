package demox;

import java.util.*;

public class Coll5 {

	public static void main(String[] args) {
		
		ArrayList<Learner> al=new ArrayList<>();
		al.add(new Learner(1,"Srikanth"));
		al.add(new Learner(3,"Dhanesh"));
		al.add(new Learner(2,"Aditya"));
		System.out.println("Before");		
		System.out.println(al);
		Collections.sort(al);
		System.out.println("After");
		System.out.println(al);
		
		
		
	}

}
class Learner implements Comparable<Learner>//java.lang
{
	int id;
	String name;
	
	Learner(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	@Override
	public int compareTo(Learner o) {
		if(this.id==o.id)
		{
			return 0;
		}
		else if(this.id>o.id)//for reverse sort <
		{
			return 1;
		}
		else
		{
			return -1;
		}
//		return this.name.compareTo(o.name);
	}
	
	public String toString()
	{
		return id+" "+name;
	}
	
	
}
/*
 * 
 * marker interface
 * -> which do not have a method for overriding
 * -> that is used to communicate meta data to the JVM
 * e.g. Serializable interface : file handling
 * 
 * 
 * functional interface
 * -> that have a single method to override
 * e.g. Runnable interface : multithreading
 *
 */
