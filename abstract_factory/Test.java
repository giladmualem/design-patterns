package abstract_factory;

public class Test {
    public static void main(String[] args) {
        ClassRoom c1 = new Class1();
        c1.getAdmin().admin();
        c1.getTeacher().teacher();
    }
}
