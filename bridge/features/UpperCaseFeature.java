package bridge.features;

public class UpperCaseFeature extends PrinterFeatere {

    @Override
    public void print(String text) {
        System.out.println(text.toUpperCase());
    }
}
