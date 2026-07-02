// Generate series and find Nth element:
import java.util.*;
class t34
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nth element to find : ");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println("the no.in the nth position : "+fact);
    }
}