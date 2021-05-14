package patterns.behavior.mediator;

public class MediatorTest {
    public static void main(String[] args) {
        Seller sellerA = new Seller("Link-House");
        Seller sellerB = new Seller("Maya-House");
        Buyer buyerA = new Buyer("Lao Wang");
        Buyer buyerB = new Buyer("Lao Lu");
        HouseMediator.getInstance().register(sellerA);
        HouseMediator.getInstance().register(sellerB);
        HouseMediator.getInstance().register(buyerA);
        HouseMediator.getInstance().register(buyerB);

        sellerA.send("城南小3室 100平 100万");
        sellerB.send("城东公寓 40平 30万");

        buyerA.send("求租一室");
        buyerB.send("求购别野");

    }
}
