package first1;

import java.util.Scanner;

public class Area_square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("area of square:"+(a*a));
		int l;int b;
		System.out.println("enter l");
		l=sc.nextInt();
		System.out.println("enter b");
		b=sc.nextInt();
		System.out.println("area of rectangle"+(l*b));
	}

}
