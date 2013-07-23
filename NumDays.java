package Trials;

import java.util.Scanner;

public class NumDays {
	private int month;
	private int day;
	private int monthDays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	public NumDays ( int month, int day){
		this.month = month;
		this.day = day;
	}
	public int getNumDays (){
		int result = 0;
		for ( int i = month-2; i >= 0; i--) {
			result += monthDays[i];
		}
		result += day;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the month:");
		int month = scan.nextInt();
		System.out.println("Enter the day:");
		int day = scan.nextInt();
		
		NumDays obj = new NumDays(month, day);
		System.out.println(obj.getNumDays());
	}

}
