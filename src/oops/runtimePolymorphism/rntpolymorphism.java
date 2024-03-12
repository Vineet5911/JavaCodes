package oops.runtimePolymorphism;

class human{
    static String name;
    static String gender;
    static int age;
    public human(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public static void speak(){
        System.out.println("I am a human");
    }

    public static void info() {
        System.out.println(name + " " + gender + " " + age);
    }
}
class boy extends human{
    public boy(String name, String gender, int age){
        super(name, gender, age);

    }
    public static void speak(){
        System.out.println("I am a boy");
    }

}
public class rntpolymorphism {
    public static void main(String[] args) {
        boy b1 = new boy("pta nhi", "male", 21);
        b1.speak();
        b1.info();

        human b2 = new human("hoga kuch", "male", 19);
        b2.speak();
        b2.info();
    }
}
