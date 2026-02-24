import java.util.Scanner;

public class d4 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(a>b)
        {
            System.out.println("a is greater");
            if(a%2==0)
            {
                System.out.println("this is even number");
            }
            else
            {
                System.out.println("this is odd number");
            }    
        }
        else
        {
            System.out.println("b is greater");
        }
        s.close();
    }
}
