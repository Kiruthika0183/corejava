package Inheritance;

import java.util.Scanner;

public class CourseList extends StudentList {

	public int crid;
	public String crname;
	
	public int getcrid()
	{
		return crid;
	}
	public void setcrid(int i)
	{
		this.crid=crid;
	}
	public String getcrname()
	{
		return crname;
	}
	public void setcrname(String string)
	{
		this.crname=crname;
	}
	
	public String toString()
	{
		return "Course ID:"+getcrid()+"Course Name:"+getcrname()+"Student ID:"+getstdid()+"Student Name:"+getstdname()+"Department:"+getdeprt();
		
	
	}
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	CourseList A[]=new CourseList[1];
	for(int i=0;i<A.length;i++)
	{
	 A[i]=new CourseList();
	 System.out.println("Enter the course id:");
	 A[i].setcrid(sc.nextInt());
	 System.out.println("Enter the course name:");
	 A[i].setcrname(sc.next());
	 System.out.println("Enter the student id:");
	 A[i].setstdid(sc.nextInt());
	 System.out.println("Enter the student name:");
	 A[i].setstdname(sc.next());
	 System.out.println("Enter Department:");
	 A[i].setdeprt(sc.next());
	 System.out.println(A[i]);	
			
	}	
	
	
	}
	}


	
