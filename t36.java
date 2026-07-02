//Find Password (stable unstable):
import java.util.*;
class t36
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[10];
        while(n>0)
        {
            int r=n%10;
            a[r]++;
            n/=10;
        }
        int freq=0;
        boolean stable=true;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0)
            {
                if(freq==0)
                {
                    freq=a[i];
                }
                else if(freq!=a[i]){
                    stable=false;
                    break;

                }
            }
        }
        if(stable)
        {
            System.out.println("Stable");
        }
        else{
            System.out.println("Not Stable");
        }

    }
}