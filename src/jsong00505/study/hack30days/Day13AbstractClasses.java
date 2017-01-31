package jsong00505.study.hack30days;

import java.util.Scanner;

public class Day13AbstractClasses {
	   public static void main(String []args)
	   {
	      Scanner sc=new Scanner(System.in);
	      String title=sc.nextLine();
	      String author=sc.nextLine();
	      int price=sc.nextInt();
	      Book new_novel = new MyBook(title,author,price);
	      new_novel.display();
	      
	   }
}

abstract class Book {
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();
}

class MyBook extends Book {
	int price;
	public MyBook(String title, String author, int price) {
		// TODO Auto-generated constructor stub
		super(title, author);
		this.price = price;
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
	
}
