package demox;
import java.util.*;
public class Coll2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al=new LinkedList<String>();//Collection with generics <>
		//type safety
		al.add("AJay");//0
		al.add("Aditya");//1
		al.add("Syamala");//2
		System.out.println(al);
		al.add(0,"Sri");
		al.add("Sri");
		System.out.println(al);
		al.set(1, "Adi");
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.isEmpty());
		System.out.println(al.contains("Adit"));
		System.out.println(al.indexOf("Sri"));
		System.out.println(al.lastIndexOf("Sri"));
		System.out.println(al.remove(0));
		System.out.println(al.remove("Adi"));
		
		
		
		LinkedList<Book> bookList=new LinkedList<>();
		bookList.add(Book.getBook(1234,"COmplete Reference Edition 1",1200));

		LinkedList<String> al1=new LinkedList<>();
		al1.add("Dhanesh");
		al1.addAll(al);
		al1.set(0, al1.get(0)+" Kumar");
		al1.set(0, al1.get(0).concat(" Jadhav"));
		System.out.println(al1.get(0));
		System.out.println(al1);
		//al1.clear();
		System.out.println(al1);
		
		String str="";
		for(String s: al)
		{
			str+=s;
		}
		
		System.out.println(str);
//		for(Book b1:bookList)
//		{
//			System.out.println(b1);
//		}
//		
//		for(int i=0;i<bookList.size();i++)
//		{
//			System.out.println(bookList.get(i));
//		}
		//		bookList.add(new Book(1233,"COmplete Reference Edition 2",1000));
//		bookList.add(new Book(1123,"COmplete Reference Edition 3",800));
//		bookList.add(new Book(4322,"COmplete Reference Edition 6",1300));
//		bookList.add(new Book(4328,"COmplete Reference Edition 4",600));
//		bookList.add(0,new Book(4354,"Let us C",210));
//	
//		Book b=new Book(4354,"Let us C",210);
//		System.out.println(b);
//		
//		System.out.println(bookList);//
	}
}
class Book 
{
	int isbn;
	String bookname;
	int price;
	public Book(int isbn, String bookname, int price) {
		super();
		this.isbn = isbn;
		this.bookname = bookname;
		this.price = price;
	}
	
	public String toString()
	{
		return "("+isbn+","+bookname+","+price+")";
	}
	public static Book getBook(int isbn, String bookname, int price)
	{
		return new Book(isbn,bookname,price);
	}
}