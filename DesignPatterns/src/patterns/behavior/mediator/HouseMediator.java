package patterns.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

public class HouseMediator {
    private static HouseMediator instance= new HouseMediator();
    private List<Customer> customers = new ArrayList<>();

    public static HouseMediator getInstance(){
        return instance;
    }

    public void register(Customer c) {
        customers.add(c);
    }

    public void relay(Customer customer, String from, String info) {
        for (Customer c: customers){
            if(!c.getClass().isInstance(customer) && !c.equals(customer))
            c.receive(from, info);
        }
    }
}
