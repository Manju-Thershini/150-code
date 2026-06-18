//is n multiple of m
import java.util.*;
class six
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number u want to check : ");
        int n=sc.nextInt();
        System.out.println("enter the number: ");
        int m = sc.nextInt();
        if(n%m==0)
        System.out.println(n+" is  a multiple of "+m);
        else
        System.out.println(n+" is  not a multiple of "+m);


    }
}