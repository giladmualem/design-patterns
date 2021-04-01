package bridge.features;

public class TabbedFeature extends PrinterFeatere {
    @Override
    public void print(String text) {
        for(Character t:text.toCharArray()){
            System.out.print(t+"\t");
        }
        System.out.println();
    }
}
