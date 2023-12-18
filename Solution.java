package project;
import java.util.Scanner;

public class Solution {
	static Scanner sc=new Scanner(System.in);
	static int a,b;
	
	static void acceptInput() {
		System.out.println("enter the first number : ");
		a=sc.nextInt();
		System.out.println("enter the second number : ");
		b=sc.nextInt();
		
	}
	public static void main(String[] args) {
		Calculator c=new CalculatorImpl();
		while(true) {
			System.out.println("\n1:Addition\n2:Substraction\n3:Multiplication\n4:division\n5:exit");
			System.out.println("enter the choice");
			int choice=sc.nextInt();
			
			if(choice>=1 && choice<=4) {
				acceptInput();
			}
			switch(choice) {
			case 1:
				System.out.println(c.add(a, b));
				break;
				
			case 2:
				System.out.println(c.sub(a, b));
				break;
				
			case 3:
				System.out.println(c.mul(a, b));
				break;
				
			case 4:
				System.out.println(c.div(a, b));
				break;
				
			case 5:
				System.out.println("invalid choice");
				System.exit(0);
				
				default:System.out.println(c.displayErrorMessage());
			}
		}
	}

}
