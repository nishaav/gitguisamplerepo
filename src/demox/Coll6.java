package demox;

import java.util.HashSet;

public class Coll6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs=new HashSet<>();
		hs.add("Priya");
		hs.add("Priyanka");
		hs.add("Mahima");
		hs.add("Sanjana");
		hs.add("Tanya");
		System.out.println(hs.size());
		System.out.println(hs);
		
		System.out.println(hs.contains("Nisha"));
		HashSet<String> hs1=(HashSet<String>)hs.clone();
		
		System.out.println(hs1.size());
		
		String data="dkdje";
		data.toCharArray();
		
		Object str[]=hs.toArray();
		for(Object s: str)
		{
			System.out.println((String)s);
		}
	}

	
	
	
}




