package factory_method;

public class Iphone implements Mobile {
    @Override
    public void calling() {
        System.out.println("Iphone: you get call from");
    }
}
