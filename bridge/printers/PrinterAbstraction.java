package bridge.printers;

import bridge.features.PrinterFeatere;

import java.util.ArrayList;
import java.util.List;

public abstract class PrinterAbstraction {
    protected List<PrinterFeatere>feateres=new ArrayList<>();

    public void printTextPage(String text){
        for(PrinterFeatere printerFeatere:feateres){
            printerFeatere.print(text);
        }
    }

    protected abstract void loadFeatures();

    public PrinterAbstraction() {
        loadFeatures();
    }
}
