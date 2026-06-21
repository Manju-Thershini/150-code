//Magic Number
import java.util.*;
class t22
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        
        while(n>0)
        {
            int s=0;
            while(n>9)
            {
                s+=n%10;
                n=n/10;
            }
            n=s;
        }
        if(n==1)
        {
            System.out.println("This ia a Magic Number");
        }
        else
        {
            System.out.println("This ia not a Magic Number");
        }
    }
}