package adapter;

public class AUCharger implements Charger{
    @Override
    public void info() {
        System.out.println("AU Charger");
    }

    @Override
    public String toString() {
        return "AUCharger{}";
    }
}
