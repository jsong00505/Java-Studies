package jsong00505.study.hack30days;

import java.util.Scanner;

public class Day12Inheritance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}	
}

class Person2 {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person2(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person2{
	private int[] testScores;
	
	Student(String firstName, String lastName, int identification, int[] testScores) {
		super(firstName, lastName, identification);
		// TODO Auto-generated constructor stub
		this.testScores = testScores;
	}

	public String calculate() {
		int ave = 0;
		int sum = 0;
		String grade;
		
		for(int i = 0; i < testScores.length; i++) {
			sum += testScores[i];
		}
		
		ave = sum / testScores.length;
		
		if(ave >= 90) {
			grade = "O";
		} else if(ave >= 80 && ave < 90) {
			grade = "E";
		} else if(ave >= 70 && ave < 80) {
			grade = "A";
		} else if(ave >= 55 && ave < 70) {
			grade = "P";
		} else if(ave >= 40 && ave < 55) {
			grade = "D";
		} else {
			grade = "T";
		}
		
		return grade;
	}
   
}
