package factory_method;

public class FactoryMethod {

    public static final String ANDROID="Android";
    public static final String IPHONE="Iphone";

    public static Mobile createMobile(String mobile){
        if (mobile.equalsIgnoreCase(ANDROID)){
            return new Android();
        }
        else  {
            return new Iphone();
        }
    }
}
