package keertha;
import java.util.Scanner;
public class prime {
	public static void main(String[] args) {
	int i,m=0,flag=0;
	int n;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	System.out.println("Enter the number");
	for(i=2;i<=m;i++)
	{
		if(n%i==0)
		{
			System.out.println("number is not prime");
			flag=1;
			break;
		}
	}
	if (flag==0)
	{
		System.out.println("number is prime");
	}
	}

}
