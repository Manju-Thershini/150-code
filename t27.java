//digitSum even: sum of even digits in N
import java.util.*;
class t27
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number :");
        int  n =sc.nextInt();
        int s=0;
        while(n>0)
        {
            int a=n%10;
            if(a%2==0)
            s+=a;
            n=n/10;
        }
        System.out.println(s);
    }
}