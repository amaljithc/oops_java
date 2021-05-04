class Account
{
	int acno;
	int balance=20000;
	String name,actype;
	void register(int no,String name,String type)
	{
		acno=no;
		this.name=name;
		actype=type;
	}
	void credit(int a)
	{
		balance=balance+a;
		System.out.println("after credict= "+balance);
	}
	void debit(int a)
	{
		if(balance-a<0)
		{
			System.out.println("sorry!! insufficient balance");
		}
		else
		{
			balance=balance-a;
			System.out.println("After debit= "+balance);
		}
	}
	
	void dis()
	{
		System.out.println("---------------Account details--------------");
		System.out.println(acno+" "+name+" "+actype+" "+balance);
		
	}
	public static void main(String arg[])
	{
		Account ob1=new Account();
		ob1.register(435363,"amal","current");
		ob1.credit(1000);
		ob1.dis();
		Account ob2=new Account();
		ob2.register(345643,"karthik","savings");
		ob2.debit(5000);
		ob2.dis();
	}
}
		
		
		