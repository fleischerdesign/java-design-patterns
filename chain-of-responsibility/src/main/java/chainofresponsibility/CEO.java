package chainofresponsibility;

public class CEO extends Approver {
    @Override
    public void approveRequest(double amount) {
        System.out.println("CEO approved the purchase of " + amount + "€");
    }
}
