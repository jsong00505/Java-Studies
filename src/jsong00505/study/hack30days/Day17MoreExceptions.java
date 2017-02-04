package jsong00505.study.hack30days;

import java.util.Scanner;

public class Day17MoreExceptions {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}

class Calculator {
	int power(int n, int p) throws Exception {
		int ans = 0;
		
		if(n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		}

		ans = (int) Math.pow(n, p);
		
		return ans;
	}
}