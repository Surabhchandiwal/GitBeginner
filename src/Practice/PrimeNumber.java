package Practice;

public class PrimeNumber {

	public static void main(String[] args) {
		// to check number is a prime number or not
		// prime number--> number greater than 1 and it should be divisible by 1 and itself
		
		int num =31 ,count=0 ;
		
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0)
				count++;
			}
			if(count==2) {
				System.out.println("Number is a prime number");
			}
			else {
				System.out.println("number is not a prime number");
			}

			
		}
		else {
			System.out.println("number is not a prime number");
		}

	}

}
