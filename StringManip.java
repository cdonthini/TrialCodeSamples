package Trials;

import java.util.regex.*;

public class StringManip {

	private String input;
	
	public StringManip ( String input ) {
		this.input = input;
	}
	
	public String toString() {
		String insert = "the";
		Pattern p = Pattern.compile("a");
		Matcher m = p.matcher(input);
		
		while (m.find()) {
			//input.replaceAll(regex, replacement)
			System.out.println(m.start() + " " + insert);
		}
		
		return null;
		
	}
	public static void main(String[] args) {
		String input = "I am a boy";
		StringManip obj = new StringManip(input);
		input = input.replaceAll("\\s[a]\\s", " the ");
		System.out.println(input);
		obj.toString();
		
	}

}
