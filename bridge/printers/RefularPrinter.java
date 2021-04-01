package bridge.printers;

import bridge.features.RegularFeature;

public class RefularPrinter extends PrinterAbstraction {
    @Override
    protected void loadFeatures() {
        this.feateres.add(new RegularFeature());
    }
}
