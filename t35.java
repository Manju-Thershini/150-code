//Find result after alternate add_sub on N:
import java.util.*;
class t35
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                s-=i;
            }
            else
            {
                s+=i;
            }
        }
        System.out.println("sum : "+s);
    }
}