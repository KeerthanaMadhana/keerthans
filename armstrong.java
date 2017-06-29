package keertha;

import java.util.Scanner;

public class armstrong {
	public static void main(String[] args) {
		int a=0,b,temp;
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		n=s.nextInt();
		temp=n;
		while (n>0)
		{
			b=n%10;
			n=n/10;
			a=a+(b*b*b);
		}
		if (temp==a)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not a armstrong number");
		}
	}

}
