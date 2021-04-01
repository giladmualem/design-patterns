package adapter;

enum Cable {
    USB_2,
    USB_3
}

enum Device {
    ANDROID,
    IPHONE
}

public class ShinyNewBox {
    private Cable cable = Cable.USB_2;
    private Device device = Device.IPHONE;
    private Charger charger = new AUCharger();

    public Cable getCable() {
        return cable;
    }

    public void setCable(Cable cable) {
        this.cable = cable;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Charger getCharger() {
        return charger;
    }

    public void setCharger(Charger charger) {
        this.charger = charger;
    }

    public ShinyNewBox() {
    }

    @Override
    public String toString() {
        return "ShinyNewBox{" +
                "cable=" + cable +
                ", device=" + device +
                ", charger=" + charger +
                '}';
    }
}
