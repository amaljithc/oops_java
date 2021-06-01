import java.util.Scanner;
class EmployeeArray
{
    int eno,salary;
    String name;
    void get()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter name");
        name=ob.nextLine();
        System.out.println("enter eno:");
        eno=Integer.parseInt(ob.nextLine());
        System.out.println("enter salary");
        salary=Integer.parseInt(ob.nextLine());
      
        
        

        
    }
    void display()
    {
        System.out.println("employee name is :"+name);
    }
    public static void main(String[] args) {
        EmployeeArray ob[]=new EmployeeArray[3];
        for(int i=0;i<3;i++)
        {
            ob[i]=new EmployeeArray();

            ob[i].get();
        }
        while(true)
        {
            System.out.println("searching....");
            System.out.println("enter eno to search:");
            Scanner no=new Scanner(System.in);
            int search_id=no.nextInt();
            for(int i=0;i<3;i++)
            {
                if(ob[i].eno==search_id)
                {
                    ob[i].display();
                    break;
                }
            }

        }
    }
}