package jsong00505.study.hack30days;

import java.util.Scanner;

public class Day4ClassVsInstance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}

class Person {
    private int age;	
    
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
		age = initialAge;
		if(age < 0) {
			System.out.println("Age is not valid, setting age to 0.");
			age = 0;
		}
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
		String ans = "";
		if(age < 13) {
			ans = "You are young.";
		} else if(age >= 13 && age < 18) {
			ans = "You are a teenager.";
		} else {
			ans = "You are old.";
		}
        System.out.println(ans);
	}

	public void yearPasses() {
  		// Increment this person's age.
		age++;
	}
}
