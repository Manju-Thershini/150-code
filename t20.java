//.Program to print the sum of odd numbers and arrangement of odd sequence
import java.util.*;
class t20
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n =sc.next();
        int s=0;
        StringBuilder even=new StringBuilder();
        StringBuilder odd =new StringBuilder();
        for(int i=0;i<n.length();i++)
        {
            int no=n.charAt(i)-'0';
            if(no%2==0)
            {
                even.append(no);   
            }
            else
            {
                odd.append(no); 
                s=s+no;  
            }
        }
        System.out.println(odd.toString()+even.toString()); 
        System.out.println("sum of odd digits : "+s);
    }
}