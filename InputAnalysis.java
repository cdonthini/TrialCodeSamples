package Trials;

import java.util.Scanner;

public class InputAnalysis {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int maxOdd = num;
		int minEven = num;
		while ( num != 0 ) {
			if ( (num % 2) == 0 ){ 
				if (minEven > num )  minEven = num; 
			}
			else {
				if (maxOdd < num) maxOdd = num;
			}
			num = scan.nextInt();
		}
		System.out.println("maxOdd: " + maxOdd);
		System.out.println("minEven: " + minEven);
	}

}
