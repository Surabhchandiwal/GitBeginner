package Practice;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandom {

	public static void main(String[] args) {
		// Generate random numbers and strings
		//Approach 1
		Random rand = new Random();
		int rand_num = rand.nextInt(10);
		System.out.println(rand_num);
		
		double rand_double =rand.nextDouble();
		System.out.println(rand_double);//it prints btw 0 and 1
		
		//approach 3--from apache class
		String ran= RandomStringUtils.randomNumeric(5);//contains 5 digit random number
		System.out.println(ran);

		String ran_alpha= RandomStringUtils.randomAlphabetic(5);
		System.out.println(ran_alpha);
	}

}
