package Promineo;

public class AnonymousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] intArray = {1,2,3,4};


		//display(intArray);

		
		
	// ex2:
		display(new int[] {1,2,3,4}); // no need to waste memory creating intarray since it is used only when calling display () method
//							this is an instance use of an array
		}
		static void display(int[] userInput) {
			
				int sum = 0;
				for(int element: userInput) { 
					sum += element;
		//			System.out.println("The sum of the array is: " + sum);
			System.out.println("The sum of an array is : " + sum);
				}
			
	}
	}


