package decorator.decorates;

import decorator.items.Item;

public class Mapel extends Item {

    private Item item;

    public Mapel(Item item) {
        this.item = item;
    }

    @Override
    public int cost() {
        return item.cost()+3;
    }

    @Override
    public String description() {
        return item.description()+" Mapel";
    }
}
