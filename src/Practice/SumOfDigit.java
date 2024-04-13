package Practice;

public class SumOfDigit {

	public static void main(String[] args) {
		// Count sum of digit in a number

		int num =123456;
		int sum = 0;
		
		while(num>0) {
			sum = sum + num%10;
			num=num/10;
		}
		System.out.println("Sum of digits:" + sum);


	}

}
