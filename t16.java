//Problem to count the total number of odd and even in the given any digit number
import java.util.*;
class t16
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int co=0,ce=0;
        while(n>0)
        {
            int a=n%10;
            if(a%2==0)
            {
                ce++;
            }
            else
            {
                co++;
            }
            n=n/10;
        }
        System.out.println("odd : "+co);
        System.out.println("even : "+ce);
    }
}