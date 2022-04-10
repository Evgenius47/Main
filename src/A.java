import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        double a = sc.nextDouble();
        System.out.print("Enter 2nd number = ");
        double b = sc.nextDouble();
        System.out.print("Enter 3rd number = ");
        double c = sc.nextDouble();
        if (a >= (-5) && a <= 5) {
            System.out.println("Number is in range [-5,5]");
        }
        if (a < (-5) || a > 5) {
            System.out.println("Number isn't in range [-5,5]");
        }
        if (b >= (-5) && b <= 5) {
            System.out.println("Number is in range [-5,5]");
        }
        if (b < (-5) || b > 5) {
            System.out.println("Number isn't in range [-5,5]");
        }
        if (c >= (-5) && c <= 5) {
            System.out.println("Number is in range [-5,5]");
        }
        if (c < (-5) || c > 5) {
            System.out.println("Number isn't in range [-5,5]");
        }
    }
}