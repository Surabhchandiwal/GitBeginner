package Practice;

public class Reverse {

	public static void main(String[] args) {

		int num = 12346 ;
		
		//lOGIC 1--USING ALGORITHM
		
		/*int rev =0;
		
		while(num!=0) {
			rev= rev*10 + num%10;
			num= num/10;
		}*/
		
		//LOGIC2--USING STRING BUFFER CLASS METHOD
		
		//StringBuffer sb = new StringBuffer(String.valueOf(num)) ;
		//StringBuffer rev =sb.reverse();
		
		//Logic 3-String builder
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		System.out.println(rev);
	}

}
