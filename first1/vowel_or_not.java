package first1;

import java.util.Scanner;

public class vowel_or_not {

	public static void main(String[] args) {
		char ch;
		System.out.println("enter any character");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o' ||ch=='u')
		{
			System.out.println("vowel");
		}
		else {
			System.out.println("consonant");
		}
	}

}
