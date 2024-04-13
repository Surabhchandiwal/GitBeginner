package Practice;

public class Swap {

	public static void main(String[] args) {
		//Logic 1
		//int temp;
		int x=100;
		int y=200;
		/*temp=x;
		x=y;
		y=temp;*/
		
		//Logic2-without using third variable with + and -
		/*x=x+y;
		y=x-y;
		x=x-y;*/
		
		//logic 3 -using * and /
		//here a and b can't be zero
		x=x*y;
		y=x/y;
		x=x/y;
		
		
		
		
		System.out.println(x);
		System.out.println(y);
		
	
		

	}

}
