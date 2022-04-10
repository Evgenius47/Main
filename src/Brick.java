import java.util.Scanner;
public class Brick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of brick = " );
        double a = scanner.nextDouble();
        System.out.print("Enter the lenght of brick = " );
        double c = scanner.nextDouble();
        System.out.print("Enter the height of hole = " );
        double x = scanner.nextDouble();
        System.out.print("Enter the lenght of hole = " );
        double y = scanner.nextDouble();
        if(a<=x && c<=y) {
            System.out.println("Passed");
        }
        if(a>x || c>y) {
            System.out.println("Failed");
        }
    }
}