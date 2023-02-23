package demox;

import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;

public class Coll11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedHashMap<Key,Value>
		HashMap<String,String> lhm=new HashMap<>();
		lhm.put("1", "Dhanesh");//put method to add the data into the collection
		lhm.put("2", "Aditya");
	//	lhm.put("3","Srikanth");
		lhm.put("5", "Shubham");
		lhm.put("4", null);
		lhm.put("1", "Nisha\nShivansh");//it will replace the value Dhanesh by the new value
		
//		System.out.println(lhm.ceilingKey("0"));
//		System.out.println(lhm.ceilingEntry("3"));
//		System.out.println(lhm.higherKey("4"));
//		System.out.println(lhm.firstKey());
//		System.out.println(lhm.lastKey());
//		System.out.println(lhm.lowerKey("4"));
//		System.out.println(lhm.floorKey("3"));
//		System.out.println(lhm.floorEntry("3"));
//		
//		LinkedHashMap<Integer,Learner> lh
		//LinkedHashMap
		//only 1 null key is acceptable and multiple null values are acceptable
		
		//TreeMap
		//null keys are not acceptable
		
		
		
		for(Map.Entry<String, String> e:lhm.entrySet())//enhanced for loop
		{
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		System.out.println("END OF PROGRAM");
		
	}

	/*
	 * A
	 * B
	 * C
	 * D
	 */
}
interface A
{
	interface B
	{
		public default void show()
		{
			System.out.println("Dummy");
		}
	}
}




/*
 * Map interface : 
 * 
 * store the data in a key-value pair
 * key needs to be unique otherwise data will be replaced. 
 * TreeMap: sorts the data on the basis of the key.
 * HashMap: it stores the data on the basis of the hash value.
 * LinkedHashMap: it stores the data in insertion order
 * 
 *
 *
 */