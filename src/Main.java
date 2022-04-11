public class Main {
    public static void main(String[] args){
        Person pers1 = new Person();
        pers1.setName("Anton");
        pers1.setBirthYear(1997);

        Person pers2 = new Person();
        pers2.setName("Vika");
        pers2.setBirthYear(2000);

        Person pers3 = new Person();
        pers3.setName("Ivan");
        pers3.setBirthYear(1963);

        Person pers4 = new Person();
        pers4.setName("Pedro");
        pers4.setBirthYear(2003);

        Person pers5 = new Person();
        pers5.setName("Nina");
        pers5.setBirthYear(1986);

        pers1.age();
        pers2.age();
        pers3.age();
        pers4.age();
        pers5.age();

        pers1.input();
        pers2.input();
        pers3.input();
        pers4.input();
        pers5.input();

        pers2.output();
        pers3.output();
        pers4.output();
        pers5.output();

        pers1.changeName();
        pers2.changeName();
        pers3.changeName();
        pers4.changeName();
        pers5.changeName();
    }
}
