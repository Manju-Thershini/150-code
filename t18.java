//Arrangement of odd sequence with count followed by even sequence with count
import java.util.*;
class t18
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n =sc.next();
        int co=0,ce=0;
        StringBuilder even=new StringBuilder();
        StringBuilder odd =new StringBuilder();
        for(int i=0;i<n.length();i++)
        {
            int no=n.charAt(i)-'0';
            if(no%2==0)
            {
                even.append(no);
                ce++;
            }
            else
            {
                odd.append(no);
                co++;
            }
        }
        System.out.println(odd.toString()+co+even.toString()+ce); 
    }
}