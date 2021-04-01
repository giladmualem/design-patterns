package decorator.items;

public class IceCream extends Item {
    @Override
    public int cost() {
        return 12;
    }

    @Override
    public String description() {
        return "IceCream";
    }
}
