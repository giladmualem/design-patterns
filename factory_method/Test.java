package factory_method;

import static factory_method.FactoryMethod.*;

public class Test {
    public static void main(String[] args) {
        Mobile a = createMobile(ANDROID);
        Mobile b = createMobile(IPHONE);
        a.calling();
        b.calling();

        Mobile c = FactoryMethod.createMobile(IPHONE);
        c.calling();

        //  run config with the type of mobile  you want.
        Mobile d = FactoryMethod.createMobile(args[0]);
        d.calling();
    }
}
