package StaticEx;

import java.io.IOException;

class Student{
	int rollno;
	String name;
	static  String college="Edubridge";
	static void change() 
	{
		college="Edubridge";
		
	}
	public Student (int r,String n)
	{
		
		super();
		this.rollno=r;
		this.name=n;
		
	}
	void display()
	{
		System.out.println(rollno+""+name+""+college);
	}}
	
public class StaticEx2 {


   public static void main(String[] args){
		// TODO Auto-generated method stub
		Student s1=new Student(445,"kirthi");
		Student s2=new Student(345,"ananya");
		s1.display();
		s2.display();
		
	
	}}



