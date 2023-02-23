package demox;
import java.util.Deque;
import java.util.ArrayList;
import java.util.Scanner;

public class Coll1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]=new int[5];
		Student ar1[]=new Student[5];
		Student student=new Student(12,"");
		//Scanner sc=new Scanner(System.in);
		//Integer i=sc.nextInt();
		//object has a state and a behaviour
		//object carries the data and can access the methods defined in the class
		int i=10;
		Integer i1=i;
		Integer i2=Integer.valueOf(i);
		String str="12";
		String str1="14";
		System.out.println(str+str1);//
		int i3=Integer.parseInt(str);
		int i4=Integer.parseInt(str1);
		System.out.println(i3+i4);
		ArrayList<Integer> al=new ArrayList<>();
		
		int i5=i1;
		int i6=i1.intValue();
		//Integer to int
		//int to String
		String str2=i2.toString();//Integer to String
		String str4=String.valueOf(i6);
	
		
		
		
		
		
		
	}

}

class Student
{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}

/*String str="java";
 * String str=new String("");
 * 
 * 
 * Casting
 * Autoboxing :
 * Conversion of primitive datatype to object
 * int->Integer
 * Unboxing :
 * conversion of object to primitive datatype
 * Integer->int
 * 
 * 
 * 
 * Collection is a framework
 * Collection : group of objects of same class
 * wrapper class: Integer,Character,String,Float,Double,Long
 * user defined
 * 
 * dynamically growable
 * 
 * generics specifies type safety
 * 
 *
 * javap java.util.Deque
 *
 *
 * framework :
 * ->it provides a built in architecture where the functionality is pre implemented
 * ->It provides a set of classes and interfaces
 * classes are implementation of the interfaces
 * 
 *  Collection : interface		Collections:class
 *  java.util package
 *  Iterable(I)
 *  ->Collection(I)
 *  -->List(I)				-->Set(I) 				-->Queue(I)
 *  --->ArrayList(C)		--->HashSet(C)			---->PriorityQueue(C)	
 *  --->LinkedList(C)		--->LinkedHashSet(C)	---->Deque(I)	
 *  --->Vector(C)			--->SortedSet(I)		------>ArrayDeque(C) extends LinkedList
 *  ----->Stack(C)          ----->TreeSet(C)
 * 
 *
 *  
 *  
 *  legacy classes ?
 *  
 *  
 *  
 *  
 *  allows duplicacy			works on unique			
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */


