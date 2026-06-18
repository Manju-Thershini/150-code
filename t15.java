// All Digits Count:
import java.util.*;
class t15{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n>0)
        {
            int a =n%10;
            c++;
            n=n/10;

        }
        System.out.println("number of digits = "+c);
    }
}