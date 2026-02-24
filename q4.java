import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name =sc.nextLine();
        double score=sc.nextDouble();
        String department=sc.next();
        System.out.println("My name is " + name + " and my score is " + score + " and my department is " + department);
        sc.close();
    }
    
}
