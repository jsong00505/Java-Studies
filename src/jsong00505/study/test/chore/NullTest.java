package jsong00505.study.test.chore;

import java.util.ArrayList;

public class NullTest {
	public static void main(String[] args) {
		String a = null;
		
		ArrayList<String> al = new ArrayList<>();
		al.add(a);
		
		System.out.println(al.isEmpty());
	}
}
