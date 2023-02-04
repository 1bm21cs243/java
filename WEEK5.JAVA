import java.util.*;
import java.lang.*;

class Account 
{
	String name,accno,type;
	Account(String n,String a,String t)
	{
		name=n;
		accno=a;
		type=t;
	}
}

class Cur_acc extends Account {
	int balance=0;
	int pen=0;
	Cur_acc(String n,String a,String t)
	{
		super(n,a,t);
	}
	void cheque_deposit(int amt)
	{
		balance+=amt;
		if(pen!=0 && balance>1000)
		{
			balance=balance-pen;
			pen=0;
			System.out.println("You have paid penalty");
		}
	}
	void balance()
	{
		System.out.println("Name: "+name+" Accno: "+accno+" Balance: "+balance);
	}

	void withdraw(int amt)
	{
		if(balance==0)
		{
			System.out.println("Account is empty");
			return;
		}
		balance=balance-amt;
		if(balance<2000)
		{
			System.out.println("You are imposed with service charge");
			pen=pen+1000;
			System.out.println("Penalty: "+pen);
		}	
		System.out.println("Name: "+name+" Accno: "+accno+" Balance: "+balance);
	}
	
	
}

class Sav_acc extends Account {
	int balance=0;
	Sav_acc(String n,String a,String t)
	{
		super(n,a,t);
	}
	
	void deposit(int amt)
	{
		balance+=amt;
	}
	void balance()
	{
		System.out.println("Name: "+name+" Accno: "+accno+" Balance: "+balance);
	}
	void interest()
	{
		double i=balance*0.08;
	 	System.out.println("Interest :"+i);
	}
	void withdraw(int amt)
	{
		if(balance==0)
		{
			System.out.println("Account is empty");
			return;
		}
		balance=balance-amt;
		System.out.println("Name: "+name+" Accno: "+accno+" Balance: "+balance);
	}	
}

class program5 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String n,acc,t;
		int amt,a,ch,ch1;
		System.out.println("Enter the name and account no ");
		n=sc.next();
		acc=sc.next();
		Sav_acc s=new Sav_acc(n,acc,"S");
		Cur_acc c=new Cur_acc(n,acc,"C");
		while(true)
		{
			System.out.println("1.Deposit\n2.Display\n3.Withdraw\n4.Interest\n5.Exit");
			System.out.println("Enter choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("1.Savings Account \n2.Current Account\nEnter");
				ch1=sc.nextInt();
				if(ch1==1)
				{
					System.out.println("Enter deposit:");
					amt=sc.nextInt();
					s.deposit(amt);
				}
				if(ch1==2)
				{
					System.out.println("Enter deposit:");
					amt=sc.nextInt();
					c.cheque_deposit(amt);
				}
				break;
			case 2:
				System.out.println("1.Savings Account \n2.Current Account\nEnter");
				ch1=sc.nextInt();				
				if(ch1==1)
				{
					s.balance();
				}
				if(ch1==2)
				{
					c.balance();
				}
				break;
			case 3:
				System.out.println("1.Savings Account \n2.Current Account\nEnter");
				ch1=sc.nextInt();				
				if(ch1==1)
				{
					System.out.println("Enter amount to withdraw:");
					a=sc.nextInt();
					s.withdraw(a);
				}
				if(ch1==2)
				{
					System.out.println("Enter amount to withdraw:");
					a=sc.nextInt();
					c.withdraw(a);
				}
				break;					
			case 4:
				s.interest();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			}	
		}
	}
}			
