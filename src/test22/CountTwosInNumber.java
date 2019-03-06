package test22;

import java.io.InputStream;
import java.util.Scanner;

public class CountTwosInNumber {
	static int number;
	static int count=0;
	
    private static void enterNumber(){
    	System.out.println("Enter number please");
    	Scanner scanner = new Scanner(System.in);
    	number=scanner.nextInt();
    }
    
    private static int countTwos() {    	
    	while(number%10!=0) {    	    		
    	if (number%10==2) {
    		count++;    		
    	}
    	number=number/10;
    	countTwos();
    	}
    	return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enterNumber();
		countTwos();
		System.out.println(count);

	}

}
