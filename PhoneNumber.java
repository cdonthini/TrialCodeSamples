package Trials;

public class PhoneNumber {

	public static final String[] keypad = { " ", " ", "ABC", "DEF", "GHI", "JKL",
			"MNO", "PQRS", "TUV", "WXYZ" };

	public static void main(String[] args) {
		int number = 2147483647;
		for ( String str : numbers(number)) {
			System.out.println(str);
		}
	}

	public static String[] numbers(int number) {
		if (number >= 0 && number < 10) {
			String[] retStr = null;
			if (number <= 1) {
				retStr = new String[] { " " };
			} else {
				retStr = new String[keypad[number].length()];
				for (int i = 0; i < keypad[number].length(); i++) {
					retStr[i] = String.valueOf(keypad[number].charAt(i));
				}
			}
			return retStr;
		} 
			String[] nextString = numbers(number / 10);
			int num = number % 10;
			String[] curStr = null;
			if (num >= 0 && num < 10) {
				
				if (num <= 1) {
					curStr = new String[] { " " };
				} else {
					curStr = new String[keypad[num].length()];
					for (int i = 0; i < keypad[num].length(); i++) {
						curStr[i] = String.valueOf(keypad[num].charAt(i));
					}
				}
			}
		
		String[] result = new String[curStr.length * nextString.length];
		int k = 0;
		
		for (String cStr : curStr) {
			for (String nStr : nextString) {
				result[k++] = nStr + cStr;
			}
		}
		return result;

	}
}
