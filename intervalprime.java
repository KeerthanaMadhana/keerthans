package keertha;
import java.util.Scanner;
public class intervalprime {
	public static void main(String[] args) {
		
			int start,end,i,j,p=0;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the  interval:");
			start=s.nextInt();
			end=s.nextInt();
			
		for(i=start;i<=end;i++)
		{
			p=0;
			for(j=2;j<=i-1;j++)
			{	
			
				if(i%j==0)
				{
					p=1;
				}
				
			}
			if(p==0)
				System.out.print(i+" ");
		}
			
	}
	}


