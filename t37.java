//Calculate sum of non-prime index values:
import java.util.*;
class t37
{
    static boolean isPrime(int n)
    {
        if(n<=1)
        return false;
        
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(!isPrime(i))
            {
                s+=a[i];
            }
        }
        System.out.println(s);
        

    }
}