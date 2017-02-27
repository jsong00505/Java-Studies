package jsong00505.study.test.chore;

import java.util.Arrays;

/**
 * Created by jsong on 27/02/2017.
 */
public class ArraySortTest {
	public static void main(String[] args) {
		String a[] = {"1", "1234", "12"};

		// lambda
		Arrays.sort(a, (left, right) -> {
			if (left.length() != right.length()) {
				return left.length() - right.length();
			} else {
				return left.compareTo(right);
			}
		});

		for (String s : a) {
			System.out.println(s);
		}
	}
}
