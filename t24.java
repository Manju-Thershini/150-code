//number palindrom
import java.util.*;
class t24
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number :");
        int  s =sc.nextInt();
        int rev=0;
        int n=s;
        while(n>0)
        {
            int a=n%10;
            rev=(rev*10)+a;
            n=n/10;
        }
        if(rev==s)
        {
            System.out.println("palindrome");

        }
        else
        System.out.println("not a palindrom");
    }
}
        