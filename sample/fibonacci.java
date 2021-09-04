import java.util.*;
class fibonacci
{
    int fib(int n){
        if(n>=3){
              return (fib(n-1)+fib(n-2));
           
        }
        else{
           return 1;

        }
    }
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num : ");
        int n=sc.nextInt();
        fibonacci ob=new fibonacci();
        int result=ob.fib(n);
        System.out.println(result);

    }
}