package Calculator;
import java.util.Scanner;
public class Calci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Arithmetic calculator");
		System.out.println("enter 1st number:");
		double num1;
		num1=sc.nextDouble();
		System.out.println("enter 2nd number:");
		double num2;
		num2=sc.nextDouble();
		System.out.println("press 1 for Addition");
		System.out.println("press 2 for subtraction");
		System.out.println("press 3 for multiplication");
		System.out.println("press 4 for division");
		System.out.println("Enter users choice");
		double choice;
		choice=sc.nextDouble();
		if(choice==1) {
			System.out.println("Addition"+(num1+num2));
		}
		else if(choice==2){
			System.out.println("subtraction"+(num1-num2));
		}
		else if(choice==3) {
			System.out.println("multiplication"+(num1*num2));
		}
		else if(choice==4) {
			System.out.println("Division"+(num1/num2));
		}	
		else {
			System.out.println("invalid input");
		}
	}

}
