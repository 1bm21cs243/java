import java.util.Scanner;

class Book{
	String name;
	String author;
	int price;
	int num_pages;
	Book()
	{
		name="";
		author="";
		price=0;
		num_pages=0;
	}
	void set(String n,String a,int p,int page)
	{
		name=n;
		author=a;
		price=p;
		num_pages=page;
	}
	public String toString()
	{
		return("\nBook Name: "+name+"\nAuthor: "+author+"\nPrice: "+price+"\nPages: "+num_pages);
	}
}

class program3{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String n,a;
		int p,page,num;
		System.out.println("Enter the number of books:");
		num=sc.nextInt();
		Book b[]=new Book[num];
		for(int i=0;i<num;i++)
		{
			b[i]=new Book();
		}
		for(int i=0;i<num;i++)
		{
			sc.nextLine();
			System.out.println("Enter the name of the book:");
			n=sc.nextLine();
			System.out.println("Enter the author of the book:");
			a=sc.nextLine();
			System.out.println("Enter the price of the book:");
			p=sc.nextInt();
			System.out.println("Enter the number of pages:");
			page=sc.nextInt();
			b[i].set(n,a,p,page);
		}
		for(int i=0;i<num;i++)
		{
			System.out.println(b[i]);
		}
	}
}
