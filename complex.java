class complex
{
	int real,img;
	complex(int real,int img)
	{
		this.real=real;
		this.img=img;
	}
	static complex sum(complex c1,complex c2)
	{
		complex tmp=new complex(0,0);
		tmp.real=c1.real+c2.real;
		tmp.img=c1.img+c2.img;
		return tmp;
	}
	public static void main(String []args)
	{
		complex ob1=new complex(3,2);
		complex ob2=new complex(5,3);
		complex tmp=sum(ob1,ob2);
		System.out.println("Sum="+tmp.real+"+"+tmp.img+"i");
	}
}	