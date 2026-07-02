//Problem to check whether all the numbers are arranged in ascending order
import java.util.*;
class t31
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pre=10;
        boolean asec=true;
        while(n>0)
        {
            int a=n%10;
            if(a>pre)
            {
                asec=false;
                break;
            }
            pre=a;
            n/=10;

        }
        if(asec)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}