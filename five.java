//Sum of last digit of two given numbers :
import java.util. *;
class five
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num1 : " );
        int n1=sc.nextInt();
        System.out.println("enter a num2 : " );
        int n2=sc.nextInt();
        n1=n1%10;
        n2=n2%10;
        System.out.println("sum of the last digit of given number : "+(n1+n2));
    }
}
