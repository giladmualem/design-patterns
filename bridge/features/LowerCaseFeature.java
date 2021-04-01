package bridge.features;

public class LowerCaseFeature extends PrinterFeatere {
    @Override
    public void print(String text) {
        System.out.println(text.toLowerCase());
    }
}
