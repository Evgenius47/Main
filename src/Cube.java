import java.util.Scanner;
public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number ");
        int n = sc.nextInt();
        int nt = n * n * n;
        String str = Integer.toString(nt);
        if(str.contains("3")){
            System.out.println("Your number in cube contains 3");
        }
        if(n==7){
            System.out.println("Reverse number is the same ");
        }
        nt = Integer.parseInt(new StringBuffer(String.valueOf(nt)).reverse().toString());
        System.out.print("Reverse number is "+nt);
        /*if(str.length()==3){
        char c1 = str.charAt(0);
        char c3 = str.charAt(2);
            String str1 = str.replace(c1,c3);
            String str2 = str1.replace(c3,c1);
            System.out.println("Swap of digits "+str2);
        }*/
        //String strn = Integer.toString(n);
        //String str1 =
        }
    }


