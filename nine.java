//Of given 5 numbers, how many are even or odd?
import java.util.*;
class nine
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=5,co=0,ce=0;
        int a[]=new  int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2!=0)
            co++;
            else
            ce++;
        }
        System.out.println("no.of even numbers "+ce);
        System.out.println("no.of odd numbers "+co);
    }
}
