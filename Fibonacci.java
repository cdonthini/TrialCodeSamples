package Trials;

public class Fibonacci {
	static int iterative(int num){
		if ( num == 1) {
			return 0;
		}
		else if ( num == 2) {
			return 1;
		}
		else if ( num >= 3) {
			int[] start = {0,1};
			int temp = 0;
			for ( int i = 2; i <= num; i++){
				temp = start[0];
				start[0] = start[0]+start[1];
				start[1] = temp;
			}
			return start[0];
		}
		return -1;
	}
	public static void main(String[] args) {
		int num = 5;
		System.out.println(recurssive(num));
		System.out.println(iterative(num));
	}
	static int recurssive (int num) {
		if ( num == 1 )
			return 0;
		else if ( num == 2) 
			return 1;
		else {
			return recurssive(num-1) + recurssive(num-2);
		}
	}

}
