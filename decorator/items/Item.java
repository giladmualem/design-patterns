package decorator.items;

public abstract class Item {
    public abstract int cost();

    public abstract String description();

    @Override
    public String toString() {
        return this.description() + " cost " + this.cost();
    }
}
