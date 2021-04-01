package singleton;
import singleton.MySingletonEagerly;

public class Test {
    public static void main(String[] args) {
        MySingletonEagerly s1 = MySingletonEagerly.getInstance();
        MySingletonEagerly s2 = MySingletonEagerly.getInstance();

        System.out.println(s1);
        System.out.println(s2);

        MySingletonLazily s3 = MySingletonLazily.getInstance();
        MySingletonLazily s4 = MySingletonLazily.getInstance();

        System.out.println(s3);
        System.out.println(s4);

        new Thread(() -> MySingletonThreadSafe.getInstance()).start();
        new Thread(() -> MySingletonThreadSafe.getInstance()).start();

        System.out.println();
    }
}
