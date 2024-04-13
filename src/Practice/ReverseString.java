package Practice;

public class ReverseString {
	public static void main(String[] args) {
		
     //1 String concatenation
		
		String ch = "ABCD";
		String rev="";
//		int len=ch.length();
//		
//		for(int i=len-1; i>=0; i--) {
//			
//			rev=rev+ch.charAt(i);
//			
//		}
		
		//2.Character array
		
//		char a[]=ch.toCharArray();
//		int len=a.length;
//		
//		for(int i=len-1;i>=0;i--) {
//			rev=rev+a[i];
//		}
		
		//3.String buffer class
		StringBuffer sb = new StringBuffer(ch);
		StringBuffer reva = sb.reverse();
		
		//4.String builder
		StringBuilder ab= new StringBuilder(ch);
		StringBuilder reve = ab.reverse();
		
		
		System.out.println("The reverse string is "+ ":"+ reve);
		
		
	}

}
