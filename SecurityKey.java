package Trials;

import java.util.Scanner;

public class SecurityKey {

	static final char[][] keypad = { {'1','2','3'},{'4','5','6'},{'7','8','9'}};
	public static void main(String[] args) {
		final String PIN  = "1991";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter PIN:");
		String input = scan.next();
		
		System.out.println(check(PIN,input));
	}
	private static boolean check(String pIN, String input) {
		if (pIN.equals(input)){
			return true;
		}
		
		for ( int i = 0; i < input.length(); i++ ) {
			int intValue = (int)input.charAt(i) - 49;
			int row = intValue / 3;
			int col = intValue % 3;
			if ( input.charAt(i) == pIN.charAt(i) || ( (row-1 >= 0) && keypad[row-1][col] == pIN.charAt(i) )
					|| ( (row+1 <= 2) && keypad[row+1][col] == pIN.charAt(i) ) || ( (col-1 >= 0) && keypad[row][col-1] == pIN.charAt(i) ) 
					|| ( (col+1 <= 2) && keypad[row][col+1] == pIN.charAt(i) ) ) {
				continue;
			}
			else return false;
		}
		//System.out.println(keypad[0][1]);
		return true;
	}

}
