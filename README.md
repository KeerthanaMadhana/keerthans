package keertha;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		int n,sum=0,temp,r;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not a palindrome number");
		}

	}

}
