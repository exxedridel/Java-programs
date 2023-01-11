public class NestedOperations{
	public static void main(String args[]){
		int operation = 3;
		int num_one = 8;
		int num_two = 4;
		int result = 0;
		
		if(operation == 1){
			result = num_one + num_two;
			System.out.println("Sum result is: " + result);
		} else if(operation == 2){
			result = num_one - num_two;
			System.out.println("Rest result is: " + result);
		} else if(operation == 3){
			result = num_one * num_two;
			System.out.println("Product result is: " + result);
		} else if(operation == 7){
			result = num_one / num_two;
			System.out.println("Division result is: " + result);
		} else {
			System.out.println("Error: Invalid choice");
		}
	}
}