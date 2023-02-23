package demox;
//edubridgeindia.com
//reverse of the domain name
//package com.edubridgeindia
public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo student=new StudentInfo();
		student.setStudentId(1);
		student.setName("Jatin");
		student.setContact("43983420");
		student.setEmail("jatin12.shukla@gmail.com");
		System.out.println(student.getStudentId()+" "+student.getName()+" "+student.getEmail()+" "+student.getContact());
		
		Creta creta=new Creta();
		System.out.println(creta.getFuelOptions());
		System.out.println(creta.getInteriorFeature());
		System.out.println(creta.getMileage());
		System.out.println(creta.getModelInfo());
		System.out.println(creta.getPrice());
		
		Car car=new Creta();
		System.out.println(car.getFuelOptions());
		System.out.println(car.getInteriorFeature());
		System.out.println(car.getMileage());
		System.out.println(car.getModelInfo());
		System.out.println(car.getPrice());
		
		Area area=new Area();
//		area.setBreadth(23);
//		area.setLength(12);
		area.length=78;
		area.breadth=12;
	}
}
/*
 *Encapsulation : is wrapping of the related components together into a single unit. 
 * encapsulated class : 
 * private member variable
 * by getter and setter methods
 * 
 * It is also referred as bean class
 * benefits :   easy to test
 * 				easy to achieve data hiding
 * 				faster execution
 */


abstract class Car
{
	abstract String getMileage();
	abstract String getFuelOptions();
	abstract String getInteriorFeature();
	abstract String getPrice();
	abstract String getModelInfo();	
}
//
class Creta extends Car
{

	@Override
	String getMileage() {
		// TODO Auto-generated method stub
		return "5Km/hr";
	}

	@Override
	String getFuelOptions() {
		// TODO Auto-generated method stub
		return "Diesel";
	}

	@Override
	String getInteriorFeature() {
		// TODO Auto-generated method stub
		return "Power stearing with smart child lock and other core essentials";
	}

	@Override
	String getPrice() {
		// TODO Auto-generated method stub
		return "8L";
	}

	@Override
	String getModelInfo() {
		// TODO Auto-generated method stub
		return "Creat EV+";
	}
	
}
//getters only : read only class
//setters only : write only class
//setter and getter both : read only write only class
class Eon extends Car
{

	@Override
	String getMileage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String getFuelOptions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String getInteriorFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String getModelInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
//POJO : Plain Old Java Object
class Area
{
	int length;
	int breadth;
	public Area()
	{
		
	}
	public int getLength() 
	{
		return length;
	}
	public void setLength(int length) 
	{
		this.length = length;
	}
	public int getBreadth() 
	{
		return breadth;
	}
	public void setBreadth(int breadth) 
	{
		this.breadth = breadth;
	}
	public Area(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
}
//POJI: Plain Old Java Interface

/*
 * 
 * Bean class :
 *-> class must be inside a package
 *-> class must be having member variables as private
 *-> class must have setter and getter methods
 *-> class must have default constructor
 *-> class must be public  
 * 
 * POJO class:
 *-> class may be inside a package
 *-> class may be having member variables as private
 *-> class may have setter and getter methods
 *-> class may have default constructor
 *-> class may be public  

"EVERY BEAN IS A POJO BUT EVERY POJO IS NOT A BEAN"


 */


