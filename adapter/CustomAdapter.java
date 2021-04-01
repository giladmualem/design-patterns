package adapter;

public class CustomAdapter implements Charger {
    private Charger charger=new AUCharger();
    @Override
    public void info() {
        System.out.println(charger.toString()+" change to IL");
    }

    @Override
    public String toString() {
        return "CustomAdapter{}";
    }
}
