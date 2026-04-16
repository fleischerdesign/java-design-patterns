package chainofresponsibility;

/**
 * A concrete Handler.
 * It can only handle requests up to 500.
 */
public class TeamLead extends Approver {
    @Override
    public void approveRequest(double amount) {
        if (amount <= 500) {
            System.out.println("TeamLead approved the purchase of " + amount + "€");
        } else if (nextApprover != null) {
            // Passing it to the next person in line
            System.out.println("TeamLead: Too expensive, passing to next...");
            nextApprover.approveRequest(amount);
        }
    }
}
