// Is Palindrome Possible?
import java.util.*;
class t23
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string :");
        String  s =sc.next();
        String rev="";
        int c=0;
        for(int i= s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        if(s.length()==rev.length())
        {
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==rev.charAt(i))
                {
                    c++;
                }
                else{
                    break;
                }
            }
            if(s.length()==c)
            {
                System.out.println("Palindrom");
            }
            else{
                System.out.println("not a Palindrom");
            }

        }
       else{
                System.out.println("not a Palindrom");
            }
    }
}