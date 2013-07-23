package Trials;
 
import java.util.Scanner;
import java.util.regex.*;
public class Replacement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter input string:");
		String input = scan.next();
		matchpattern(input);
		String regex = "[AaEeIiOoUu]";
		String replacement = "^";
		System.out.println("String method:" +input.replaceAll(regex, replacement));
	}
	
	static String patternmatch ( String input ) {
		String str[] = input.split("[AaEeIiOoUu]");
		String result = "";
		for ( String s : str ) {
			result += s + "^";
		}
		return result;
	}
	
	static void matchpattern ( String input ) {
		Pattern p = Pattern.compile("[AaEeIiOoUu]");
		Matcher m = p.matcher(input);
		String str = "";
		int startIndex = 0;
		int count = 1;
		while(m.find()) {
			str = str + input.substring(startIndex,m.start()+1) + "^";
			startIndex = str.length() - count++;
		}
		System.out.println(str + input.substring(startIndex,input.length()) );
	}

}
