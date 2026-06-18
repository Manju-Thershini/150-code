// nth prime
import java.util.*;
class t13
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,num=1; 
       
        while(count<n)
        {          
                num++;
                boolean prime=true;
                for(int i=2;i<=Math.sqrt(num);i++)
                {
                    if(num %i==0)
                    {
                        prime=false;
                        break;
                    }
                }
                if(prime==true)
                count++;
        }
        System.out.println(num);
    }
}