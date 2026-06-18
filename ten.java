// Is Prime
import java.util. *;
class ten
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num : " );
        int n=sc.nextInt();
        boolean isprime=true;
        if(n<=1)
        {
            isprime=false;
        }
        else
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    isprime=false;
                }
                else
                {
                    isprime=true;
                }
            }
        }
        if(isprime)
        System.out.println(n+"is prime");
        else
        System.out.println(n+"is not prime");

    }
}