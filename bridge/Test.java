package bridge;

import bridge.printers.DeluxPrinter;
import bridge.printers.MediumPrinter;
import bridge.printers.PrinterAbstraction;
import bridge.printers.RefularPrinter;

public class Test {
    public static void main(String[] args) {
        PrinterAbstraction print=new DeluxPrinter();
        print.printTextPage("hello You");
    }

}
