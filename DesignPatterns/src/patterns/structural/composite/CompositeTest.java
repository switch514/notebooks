package patterns.structural.composite;

import patterns.structural.composite.clear.CompositeClear;
import patterns.structural.composite.clear.LeafClear;
import patterns.structural.composite.safe.CompositeSafe;
import patterns.structural.composite.safe.LeafSafe;

public class CompositeTest {
    public static void main(String[] args) {
        CompositeClear cc0 = new CompositeClear("CC0");
        CompositeClear cc1 = new CompositeClear("CC1");
        LeafClear lc0 = new LeafClear("LC0");
        LeafClear lc1 = new LeafClear("LC1");
        cc0.add(lc0);
        cc0.add(cc1);
        cc1.add(lc1);
        cc0.operation();

        // safe mode
        CompositeSafe cs0 = new CompositeSafe("Cs0");
        CompositeSafe cs1 = new CompositeSafe("Cs1");
        LeafSafe ls0 = new LeafSafe("Ls0");
        LeafSafe ls1 = new LeafSafe("Ls1");
        cs0.add(ls0);
        cs0.add(cs1);
        cs1.add(ls1);
        cs0.operation();
    }
}
