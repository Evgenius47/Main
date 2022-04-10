import java.util.Scanner;
public class Calls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost per minute for 1st country ");
        double c1 = sc.nextDouble();
        System.out.println("Enter cost per minute for 2nd country ");
        double c2 = sc.nextDouble();
        System.out.println("Enter cost per minute for 3rd country ");
        double c3 = sc.nextDouble();
        System.out.println("Enter time of 1st call ");
        double t1 = sc.nextDouble();
        System.out.println("Enter time of 2nd call ");
        double t2 = sc.nextDouble();
        System.out.println("Enter time of 3rd call ");
        double t3 = sc.nextDouble();
        System.out.println("About which call you want to get info? ");
        double p = sc.nextInt();
        if (p == 1) {
            p = c1 * t1;
            System.out.println("Cost for 1st call " + p);
        }
        if (p == 2) {
            p = c2 * t2;
            System.out.println("Cost for 1st call " + p);
        }
        if (p == 3) {
            p = c3 * t3;
            System.out.println("Cost for 1st call " + p);
            System.out.println("Do you want general info? ");
            String str = sc.next();
            if (str.equals ("No")) {
                System.out.println("Goodbye");
            }
            if(str.equals ("Yes")) {
                double g = (c1*t1)+(c2*t2)+(c3*3);
                System.out.println("General info "+g);
            }
        }
    }
}