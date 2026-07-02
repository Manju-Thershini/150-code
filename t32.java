// Stepping Number or Not
import java.util.*;
class t32
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n =sc.next();
        boolean step=true;
        for(int i=0;i<n.length()-1;i++)
        {
            int no1=n.charAt(i)-'0';
            int no2=n.charAt(i+1)-'0';
            if(Math.abs(no1-no2)!=1)
            {
                step=false;
                break;
            }

        }
        if(step)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
             
       
    }
}