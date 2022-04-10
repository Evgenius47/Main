import java.util.Scanner;
public class Flower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius ");
        double r = sc.nextDouble();
        double C = 2 * r * 3.14;
        double S = r * r * 3.14;
        System.out.println("Perimeter = " + C);
        System.out.println("Area = " + S);
    }
}