package decorator;

import decorator.decorates.Mapel;
import decorator.items.IceCream;

public class Test {
    public static void main(String[] args) {
        IceCream iceCream=new IceCream();
        Mapel mapel=new Mapel(iceCream);
        System.out.println(mapel);
    }
}
