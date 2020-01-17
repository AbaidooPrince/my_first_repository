package org.amalitech.findPerfectSqure;

public class perfectsquare_09012019 {
	/*1. Check square root of number
	 2. Cast the results to integer
	 3. Compare if same(non perfect squares will decimal.)
	 4. Output 
	 */
	
	public static void main(String []agrs) {
	//declaring and initialising number	
		int numb1 = 121;
		int numb2 = 625;
		int numb3 = 114;
		
	//Passing numbers through findNextSquare
		findNextSquare(numb1);
		findNextSquare(numb2);
		findNextSquare(numb3);
			
	}
	// Method findNextSquare	
	public static void findNextSquare (int input) {
		//finding square root of input
		double inSqrt = Math.sqrt(input);
		//casting root for comparison
		int myInt = (int) inSqrt;
			if(myInt==inSqrt) {		
				//find next perfect square if comparison is true
				int nextperf = (int) Math.pow((myInt+1), 2);
				//Output condition
				System.out.printf("findNextSquare(%d) --> returns %d%n", input, nextperf);
				}
			else {
				//output condition
				System.out.printf("findNextSquare(%d) --> "
								+ "returns -1 since %d is not a perfect square %n", input, input);
				}
					
			return;
		}
	
	
	
}


