package bridge.printers;

import bridge.features.LowerCaseFeature;
import bridge.features.RegularFeature;
import bridge.features.UpperCaseFeature;

public class MediumPrinter extends PrinterAbstraction {
    @Override
    protected void loadFeatures() {
        this.feateres.add(new RegularFeature());
        this.feateres.add(new LowerCaseFeature());
        this.feateres.add(new UpperCaseFeature());
    }
}
