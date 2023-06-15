package com.day3;

public class ClassBook {
private String bookName;
private int numberOfPages;
private String authorName;
private double price;

public ClassBook(String bookName, int numberOfPage, String authorName, double price)
{
	this.bookName=bookName;
	this.numberOfPages=numberOfPage;
	this.authorName=authorName;
	this.price=price;
}
public void display()
{
	System.out.println("Book Name is :" +bookName);
	System.out.println("Number of Pages :" +numberOfPages);
	System.out.println("Book AuthorName :" +authorName);
	System.out.println("Book Price is :" +price);
}
}
