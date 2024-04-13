package Practice;

public class LargestofNumber {

	public static void main(String[] args) {
		// Print the largest of 3 numbers
		int a=100;
		int b=200;
		int c=30;
		
		//Logic1
		
//		if(a>b && a>c) {
//			System.out.println(a +":"+"is the largest number");
//		}
//		else if(b>a && b>c){
//			System.out.println(b +":"+"is the largest number");
//		}
//		else {
//			System.out.println(c +":"+"is the largest number");
//		}
		
		//Logic 2--ternary poerator--it returns largest value
		
		int largest1 = a>b?a:b;//it will assign whichever value is largest
		int largest2 = c>largest1?c:largest1; //it will assign whichever values i largest
			System.out.println(largest2);

	}

}
