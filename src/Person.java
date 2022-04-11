 import java.util.Scanner;
    public class Person {
        private String name;
        private int birthYear;
        final int a = 2022;

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setBirthYear(int birthYear) {
            this.birthYear = birthYear;
        }
        public int getBirthYear(){
            return birthYear;
        }

        void age() {
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter actual year ");
        int a = sc.nextInt();*/
            int year = a - birthYear;
            System.out.println("Your are " + year);
        }
        void input(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Write name ");
            String fn = sc.next();
            setName(fn);
            System.out.println("Write year of birth ");
            int fa = sc.nextInt();
            setBirthYear(fa);
            System.out.println("Added name is "+fn);
            System.out.println("Added year of birth is "+fa);
        }
        void output() {
            int year = a - birthYear;
            System.out.println("Person's name is " + name + " he is "+year);
        }
        void changeName(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Write new name ");
            String str = sc.next();
            String str1 = str.replace(name, str);
            System.out.println("Name is changed. New name is "+str1);
        }
    }
