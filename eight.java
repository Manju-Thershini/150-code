//Of given 5 numbers, how many are odd?
import java.util.*;
class eight
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=5,c=0;
        int a[]=new  int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2!=0)
            c++;

        }
        System.out.println("no.of odd numbers "+c);
    }
}

