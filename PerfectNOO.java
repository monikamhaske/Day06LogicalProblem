package Test;
import java.util.Scanner;
public class PerfectNOO 
{
	private static Scanner res1;
		
		public static void main(String[] args) {
			int i, Number, Sum = 0 ;
			res1 = new Scanner(System.in);		
			System.out.println("  Enter any Number: ");
			Number = res1.nextInt();

			for(i = 1 ; i < Number ; i++) {
				if(Number % i == 0)  {
					Sum = Sum + i;
				}
			}
			if (Sum == Number) {
				System.out.format("  No is a Perfect Number", Number);
			}
			else {
				System.out.format("  No is NOT a Perfect Number", Number);
			}
		}
	}

