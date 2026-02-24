import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String address=sc.nextLine();
        int age=sc.nextInt();
        System.out.println("My name is " + name + " and my age is " + age + " and my address is " + address);
        sc.close();
    }
    
}
