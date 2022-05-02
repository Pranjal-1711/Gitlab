package Banking;

import java.util.Scanner;

public class Bank
{
	String name;
	int ammount;
	
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		name=s.nextLine();
		System.out.println("Enter the Ammount");
		ammount=s.nextInt();
	}
	
	void deposit()
	{
		System.out.println("Deposit="+ammount);
		
	}
	void withdraw()
	{
		System.out.println("Withdraw=3000");
	}
	void  display()
	{
		System.out.println(ammount);
	}
}

	 class Saving extends Bank
	{
		void deposit()
		{
			System.out.println("Deposit=50000");
		}
		void withdraw()
		{
			System.out.println("Withdraw=6000");
		}
	}

		 class Overdraft extends Saving
		{
			void deposit()
			{
				System.out.println("Ammount=1000");
			}
			void withdraw()
			{
				System.out.println("Withdraw=7000");
			}
		}
	