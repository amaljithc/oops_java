class Employee
{
	String name;
	int sallary,empid;
	void register(int id,String name,int s)
	{
		empid=id;
		this.name=name;
		sallary=s;
	}
	void dis()
	{
		System.out.println(empid+" "+name+" "+sallary);
	}
	public static void main(String arg[])
	{
		Employee ob1=new Employee();
		ob1.register(34,"amal",33000);
		ob1.dis();
		Employee ob2=new Employee();
		ob2.register(35,"karthik",34999);
		ob2.dis();
	}
}


		