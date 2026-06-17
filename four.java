//Return second last digit of given number :
import java.util. *;
class four
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num : " );
        int n=sc.nextInt();
        n=n%100;
        n=n/10;
        System.out.println("the second last digit : "+n);
    }
}
