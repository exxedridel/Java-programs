public class Operations{
	public static void main(String args []){
		int num_one = 4;
		int num_two = 4;
		int result = 0;
		
		result = num_one + num_two / 2;
		System.out.println("The incorrect result is: " + result);
		
		result = (num_one + num_two) / 2;
		System.out.println("The correct result is: " + result);
	}
}