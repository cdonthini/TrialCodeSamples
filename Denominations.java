package Trials;

public class Denominations {
	private double amount;
	private int denomination[] = {5000,1000,500,100,25,10};
	private String words[] = {"fifties","tens","fives","ones","quarters","dimes"};
	//Write algorithm to return change in denominations of 10$, 5$, 1$, 25 cents, 10 cents
	public Denominations( double amount) {
		this.amount = amount;
	}
	public void calculate () {		
		amount = amount * 100;
		int num = 0;
		for (int i = 0; i < denomination.length; i++) {
			 num = (int) (amount / denomination[i]);
			 if ( num > 0) {
				 System.out.println(num + " " +words[i]);
				 amount = amount % denomination[i];
			 }
			 
			 
		}		
		
	}
	public static void main(String[] args) {
		Denominations obj = new Denominations(129.73);
		obj.calculate();
	}

}
