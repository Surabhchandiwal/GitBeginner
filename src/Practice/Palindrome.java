package Practice;

import java.util.Scanner;

public class Palindrome {

	private static Scanner sc;

	public static void main(String[] args) {
    sc = new Scanner(System.in);
    System.out.println("Enter your input");
    
    int num=sc.nextInt();
    int org_num = num;
    
    int rev =0;
	
	while(num!=0) {
		rev= rev*10 + num%10;
		num= num/10;
	}
	//System.out.println(rev);
	
	if(rev==org_num) {
		System.out.println(org_num + ":" +" is a palindrone number");
	}
	else
	{
		System.out.println(org_num +":" + "is not a palindrone number");

	}

    
	}

}
