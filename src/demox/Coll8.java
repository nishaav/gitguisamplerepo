package demox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Coll8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Learners> al=new ArrayList<>();
		al.add(new Learners(1,"Srikanth"));
		al.add(new Learners(3,"Dhanesh"));
		al.add(new Learners(2,"Aditya"));
		System.out.println("Before Id Sort");		
		System.out.println(al);
		Collections.sort(al,new IdComp());
		System.out.println("After Id Sort");
		System.out.println(al);
		System.out.println("Before Name Sort");		
		System.out.println(al);
		Collections.sort(al,new NameComp());
		System.out.println("After Name Sort");
		System.out.println(al);

	}

}
class Learners 
{
	int id;
	String name;
	String address;
	Learners(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id +" "+name;
	}
}
class IdComp implements Comparator<Learners>
{
	@Override
	public int compare(Learners o1, Learners o2) {
		// TODO Auto-generated method stub
		if(o1.id==o2.id)
		{
			return 0;
		}
		else if(o1.id>o2.id)//for reverse sort <
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
class NameComp implements Comparator<Learners>
{

	@Override
	public int compare(Learners o1, Learners o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}




