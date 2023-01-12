import java.util.Scanner;

public class Employees{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String name = "";
		int key = 0, antiquity = 0;		
		
		System.out.println("***************************************************");
		System.out.println("*Welcome to the Coca-Cola Company vacations system*");
		System.out.println("***************************************************");
		System.out.println("");
		System.out.println("");
		
		System.out.print("Whats the employee's name?: ");
		name = in.nextLine();
		System.out.println("");
		
		System.out.print("How many years of service does the employee have?: ");
		antiquity = in.nextInt();
		System.out.println("");
		
		System.out.print("Which is the employee's key? (1-Operator, 2-Sales, 3-Manager): ");
		key = in.nextInt();
		System.out.println("");
		
		if(key == 1){
			
			if(antiquity == 1){
				System.out.println("Employee: " + name + " has the benefit of 6 day PTO");
			} else if(antiquity >= 2 && antiquity <= 6){
				System.out.println("Employee: " + name + " has the benefit of 14 day PTO");
			} else if(antiquity >= 7){
				System.out.println("Employee: " + name + " has the benefit of 20 day PTO");
			}
			
		} else if(key == 2){
			
			if(antiquity == 1){
				System.out.println("Employee: " + name + " has the benefit of 7 day PTO");
			} else if(antiquity >= 2 && antiquity <= 6){
				System.out.println("Employee: " + name + " has the benefit of 15 day PTO");
			} else if(antiquity >= 7){
				System.out.println("Employee: " + name + " has the benefit of 22 day PTO");
			}
			
		} else if(key == 3){
			
			if(antiquity == 1){
				System.out.println("Employee: " + name + " has the benefit of 10 day PTO");
			} else if(antiquity >= 2 && antiquity <= 6){
				System.out.println("Employee: " + name + " has the benefit of 20 day PTO");
			} else if(antiquity >= 7){
				System.out.println("Employee: " + name + " has the benefit of 30 day PTO");
			}
			
		} else {
			System.out.println("Error: Departmenmt key is incorrect");
		}
	}
}