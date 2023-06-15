package com.day3;

public class MarkSheet {

	public static void main(String[] args) {
		int marks=90;
		if(marks<35)
    {
    	System.out.println("D Grade");
	}
		else if(marks>=35 && marks<45)
		{
			System.out.println("C Grade");
		}
		else if(marks>=45 && marks<60) {
			System.out.println("B Grade");
		}
		else if(marks>=60 && marks<75) {
			System.out.println("A Grade");
		}
		else//(marks>=75 && marks>90)
		{
			System.out.println("Distintion");
		}
		
	   }

}
