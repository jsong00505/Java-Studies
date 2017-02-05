package jsong00505.study.hack30days;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day18QueuesAndStacks {
	
    List<Character> stack = new ArrayList<>();
	List<Character> queue = new ArrayList<>();
	
	void pushCharacter(char ch) {
		stack.add(ch);
	}
	
	void enqueueCharacter(char ch) {
		queue.add(ch);
	}
	
	char popCharacter() {
		int size = stack.size();
		char res = stack.remove(size-1);
		
		return res;
	}
	
	char dequeueCharacter() {
		char res = queue.remove(0);
		
		return res;
	}
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18QueuesAndStacks p = new Day18QueuesAndStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
    
}
