import java.util.Scanner;
public class Train1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "What is your name? ";
        String str1 = "Where do you live, ";
        System.out.println(str);
        String n = sc.next();
        System.out.println(str1 + n + "?");
        String p = sc.next();
        System.out.println("Your name is " +n);
        System.out.println("You live in " +p);
    }
}
