//is palindrom model-2
import java.util.*;
class t23_1
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string :");
        String  s =sc.next();
        String rev="";
        s=s.toLowerCase();
        for(int i= s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev))
        {
            System.out.println("palindrom");
        }
            
       else{
                System.out.println("not a Palindrom");
            }
    }
}