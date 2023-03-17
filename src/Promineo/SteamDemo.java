package Promineo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Think of sream as collection of values
public class SteamDemo {

	public static void main(String[] args) {
//stream is faster than collection, does not allow to change existing data
	// use it when you have a large chuck of data
		
//		
//		
	 List <Integer> someNums = Arrays.asList(7,8,3,4,2,5,9,6,1);
//		 
//		 
//		 
//		 
//		 
//		 
//		 // loop op throgh arrays list 
//		 
//		 for(int n:someNums) {
//			 System.out.println(" " + n *2 );
//		 }
	
	
	
	
	Stream <Integer>Stream = someNums.stream();
	Stream.forEach(n->System.out.println(" " + n * 3));
	
	}

}
