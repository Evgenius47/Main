import java.util.Scanner;
//import java.lang.Math;
public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //int min = Math.min(a,b);
        if(a<b && a<c) {
            System.out.println("Min number is " + a);
        }
        if(b<a && b<c) {
            System.out.println("Min number is " + b);
        }
        if(c<a && c<b) {
            System.out.println("Min number is " + c);
        }
        if(a>b && a>c) {
            System.out.println("Max number is " + a);
        }
        if(b>a && b>c) {
            System.out.println("Max number is " + b);
        }
        if(c>a && c>b) {
            System.out.println("Max number is " + c);
        }
    }
}
