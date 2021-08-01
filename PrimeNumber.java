package Test;
import java.util.Scanner;
public class PrimeNumber 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in) ;
		int no,count=0;
		System.out.println("Enter The Number");
		no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
				count++;
		}
		if(count==2)
			System.out.println("Number is Prime");
		else
		{
			System.out.println("Number is not Prime");	
		}
		}
}

			
		
	