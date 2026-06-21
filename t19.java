//Arrangement of odd sequence followed by even sequence
import java.util.*;
class t19
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n =sc.next();
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
            }
        }
        System.out.println(odd.toString()+even.toString()); 
    }
}