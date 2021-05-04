class Product
{
	int pcode,price;
	String pname;
	void read(int pc,int pr,String pn)
	{
		pcode=pc;
		price=pr;
		pname=pn;
	}
	void dis()
	{
		System.out.println(pcode+" "+price+" "+pname);
	}
	public static void main(String arg[])
	{
		Product ob1=new Product();
		ob1.read(1,19999,"huawei");
		ob1.dis();
		Product ob2=new Product();
		ob2.read(2,39990,"samsung");
		ob2.dis();
		Product ob3=new Product();
		ob3.read(3,490,"oppo");
		ob3.dis();
		if(ob1.price<ob2.price && ob1.price<ob3.price)
		{
			System.out.println("huawi has low price");
		}
		else if(ob2.price<ob3.price)
		{
			System.out.println("samsung has low cost");
		}
		else
		{
			System.out.println("oppo has low cost");
		}
	}
}
	