package com.day3;

public class MyClassBook {

	public static void main(String[] args) {
		System.out.println("DESCRIPTION OF BOOK");
		System.out.println("********************");
		ClassBook java=new ClassBook("Core Java",150,"Naier Ali",200);
		java.display();	
		
		System.out.println("\n");
		
		ClassBook dbms=new ClassBook("DBMS",200,"SAIF",250);
		dbms.display();
	}

}
