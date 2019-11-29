package main.action.responseChain.code;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/29
 */
public abstract class Approver {
    Approver nextApprover;
    String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    //处理审批请求的方法，由子类完成
    abstract void processRequest(PurchaseRequest request);
}
