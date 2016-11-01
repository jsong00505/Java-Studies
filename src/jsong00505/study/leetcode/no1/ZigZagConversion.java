package jsong00505.study.leetcode.no1;

public class ZigZagConversion {
	/*
	 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
	 * (you may want to display this pattern in a fixed font for better legibility)
	 * 
	 * P   A   H   N
	 * A P L S I I G
	 * Y   I   R
	 * 
	 * And then read line by line: "PAHNAPLSIIGYIR"
	 * Write the code that will take a string and make this conversion given a number of rows:
	 * 
	 * string convert(string text, int nRows);
	 * 
	 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
	 * 
	 * 
	 * sol1:
	 * There is a rule. The interval length of strings is 2(row - 1).
	 * so if 3 will be like this:
	 * 1     5     9     13   -> 4
	 * 2  4  6  8  10 12 14   -> 2, 2
	 * 3     7     11         -> 4
	 * 
	 * if 4,
	 * 1       7       13     -> 6
	 * 2    6  8    12 14     -> 4, 2
	 * 3  5    9  11   15     -> 2, 4
	 * 4       10      16     -> 6
	 * 
	 * yeah, you can see the rule.
	 */
    public String convert(String s, int numRows) {
        return "";
    }
}
