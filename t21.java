//2 digit reduced subtracted form
import java.util.*;
class t21
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n =sc.next();
        int d=0;
        StringBuilder seq=new StringBuilder();
        for(int i=0;i<n.length()-1;i++)
        {
            int no1=n.charAt(i)-'0';
            int no2=n.charAt(i+1)-'0';
            seq.append(Math.abs(no1-no2));

        }
        System.out.println(seq.toString()); 
       
    }
}