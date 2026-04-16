package chainofresponsibility;

/**
 * Demonstrating the Chain of Responsibility.
 * We throw requests into the beginning of the chain and let the system decide who handles them.
 */
public class Main {
    public static void main(String[] args) {
        Approver teamLead = new TeamLead();
        Approver ceo = new CEO();

        // Building the chain: TeamLead -> CEO
        teamLead.setNextApprover(ceo);

        System.out.println("--- Request: 300€ ---");
        teamLead.approveRequest(300);

        System.out.println("\n--- Request: 15.000€ ---");
        teamLead.approveRequest(15000);
    }
}
