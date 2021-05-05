class Rectangle
{
    double length,breadth,area;
    String color;
    Rectangle()
    {
        length=0;
        breadth=0;
        area=0;
        color="not assigned";
    }
    Rectangle(double l,double b,String c)
    {
        length=l;
        breadth=b;
        area=l*b;
        color=c;
    }

    static void compare(Rectangle ob1,Rectangle ob2)
    {
        if(ob1.area==ob2.area&&ob1.color==ob2.color)
         System.out.println("Matching rectangle");
        else
         System.out.println("Nonmatching rectangle");
    }

    public static void main(String[] args)
    {
      Rectangle  ob1=new Rectangle(5,4,"orange");
      Rectangle ob2=new Rectangle(4,5,"orange");
      Rectangle ob3=new Rectangle(5,5,"red");
      compare(ob1,ob2);
      compare(ob2,ob3);
    }
}

    
        
