package first1;
import java.util.Scanner;

public class Else_if {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		if(a==0)
			System.out.println("enter another num");
		else if(a%2==0)
			System.out.println("even");
		else if(a%2==1)
			System.out.println("odd");
		
	
		
		

	}

}
