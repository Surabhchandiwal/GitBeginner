package Practice;

public class PalindromeString {

	public static void main(String[] args) {
		
		String ch = "ABCBA";
		String rev="";
		
		char a[]=ch.toCharArray();
		int len=a.length;
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+a[i];
		}

		
		
		System.out.println("The reverse string is "+ ":"+ rev);
		
		if(ch.equals(rev)) {
			System.out.println(rev + ":" +" is a palindrone number");
			
		}
		else {
			System.out.println(rev +":" + "is not a palindrone number");

		}
	}

}
