import java.util.Scanner;
public class Pow {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int r;
        System.out.print("Enter your number = ");
        int n = in.nextInt();
        System.out.print("Enter your exponent = ");
        int m = in.nextInt();
        r = (int) Math.pow(n, m);
        System.out.println("Result " + r);
    }
}

