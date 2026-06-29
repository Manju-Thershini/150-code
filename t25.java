//digitSum opt: sum of even or odd digits
import java.util.*;
class t25
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number :");
        int  n =sc.nextInt();
        System.out.println("enter e or o : ");
        char s=sc.next().charAt(0);
        int so=0,se=0;
        while(n>0)
        {
            int a=n%10;
            if(s=='e' && a%2==0)
            {
                se+=a;
            }
            if(s=='o' && a%2!=0)
            {
                so+=a;
            }
            n=n/10;
        }
        if(s=='e')
        {
            System.out.println("sum of even number :" +se);
        }
        if(s=='o'){
           System.out.println("sum of odd number :" +so); 
        }
    }
}