package keertha;

import java.util.Scanner;

public class armstrong {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	        int range=s.nextInt();
		int a,b,csum,count=0;
		b=1
			while(b<=range)
			{
				sum=0;
				c=b;
				while(c>0)
				{
					a=c%10;
					sum=sum+(a*a*a);
					c=c/10;
				}
				if(sum==b)
				{
					System.out.println(b+"armstrong no");
					count=count+1;
				}
				b++;
			}
		System.out.println("armstrong no present in range"+count);
	}
}
