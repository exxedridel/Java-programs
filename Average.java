public class Average{
	public static void main(String args[]){
		int math = 5;
		int biology = 8;
		int chemistry = 7;
		int average = 0;
		
		average = (math + biology + chemistry) / 3;
		
		if(average >= 6){
			System.out.println("Student passed");
		} else {
			System.out.println("Student failed");
		}
	}
}