//Sum of Sums of Digits in Cyclic order:
import java.util.*;
class t33
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0,c=0;
        while(n>0)
        {
            int r=n%10;
            s+=r;
            c++;
            n/=10;
        }
        int res=s*c;
        System.out.println(res);
    }
}