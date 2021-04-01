package decorator.items;

public class Coffee extends Item {
    @Override
    public int cost() {
        return 10;
    }

    @Override
    public String description() {
        return "coffee";
    }
}
