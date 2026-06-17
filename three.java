//Return last digit of the given number 
import java.util. *;
class three  
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num : " );
        int n=sc.nextInt();
        n=n%10;
        System.out.println("the last digit : "+n);
    }
}