class Cpu
{
    int price;
    Cpu(int p)
    {
        price=p;
    }
    class Processor
    {
        int core ;
        String manufacturar;
        Processor(int c,String m)
        {
            core=c;
            manufacturar=m;
        }
        void display()
        {
            System.out.println("core no is :"+core+"\n manufacturar is "+manufacturar);
        }
    }
    static class Ram
    {
        int memory;
        String manufacturar;
        Ram(int m,String mf)
        {
            memory=m;
            manufacturar=mf;
        }
        void display()
        {
            System.out.println("memory is :"+memory+"GB \n"+"manufacturar is :"+manufacturar);
        }
    }
    void display()
    {
        System.out.println("price of the cpu is :"+price);
    }
    public static void main(String[] arg)
    {
        Cpu ob1=new Cpu(34000);
        Cpu.Processor ob2=ob1.new Processor(8,"razen");
        Cpu.Ram ob3=new Ram(16,"wd green");
        ob1.display();
        ob2.display();
        ob3.display();
    }
}
        
