import java.util.Scanner;

public class ui {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();

        System.out.print("Enter a float value: ");
        float floatValue = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleValue = sc.nextDouble();

        System.out.print("Enter a character: ");
        char charValue = sc.next().charAt(3);

        System.out.print("Enter true or false: ");
        boolean boolValue = sc.nextBoolean();

        sc.nextLine();

        System.out.print("Enter a string: ");
        String stringValue = sc.nextLine();

        System.out.println("\n--- User Entered Data ---");
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Character: " + charValue);
        System.out.println("Boolean: " + boolValue);
        System.out.println("String: " + stringValue);
        sc.close();
    }
}
