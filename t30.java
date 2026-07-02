//Unique Digits Count:
import java.util.*;
class t30
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        int a[]=new int[10];
        int c=0;
        while(n>0)
        {
            int r=n%10;
            a[r]++;
            n=n/10;
        }
        for(int num : a)
        {
            if(num>0)
            {
                c++;

            }
        }
        System.out.println("No. of non-repeated digits : "+c);
    }
}