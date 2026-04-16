package chainofresponsibility;

/**
 * The base Handler class.
 * It defines how to pass the request along the chain.
 */
public abstract class Approver {
    // The next link in the chain
    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    /**
     * Every concrete approver must decide how to handle the request.
     */
    public abstract void approveRequest(double amount);
}
