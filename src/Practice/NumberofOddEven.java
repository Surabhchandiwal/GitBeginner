package Practice;

public class NumberofOddEven {
	//no of odd and even digits in a number

	public static void main(String[] args) {

		int odd_count = 0;
		int even_count = 0;
		int num =12345;
		
		while(num>0) {
			int rem = num%10;
			
			if(rem%2==0) {
				even_count++ ;
			}
			else{
				odd_count++ ;
			}
			num=num/10;
		}
		System.out.println("No. of odd number" + odd_count);
		System.out.println("No. of odd number" + even_count);

	}

}

	