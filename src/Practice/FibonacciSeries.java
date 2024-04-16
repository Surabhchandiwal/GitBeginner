package Practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		// generate fibonacci series--0 1  1 2 3 5 8 13
		int n1=0 , n2=1 , add ;
		System.out.println(n1 + " " + n2 +" ");
		
		for(int i=2;i<10;i++) {
			add = n1 + n2;
			System.out.println(" "+ add);
			n1=n2;
			n2=add;
			System.out.println("Thank you");
		}

	}

}
