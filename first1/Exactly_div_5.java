package first1;
import java.util.Scanner;

public class Exactly_div_5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number");
		
		int a=sc.nextInt();
		
		if(a%5==0) {
			System.out.println("exactly div by 5");
		}
		else {
			System.out.println("not div");
		}
		
	}

}
