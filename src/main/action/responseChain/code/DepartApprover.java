package main.action.responseChain.code;

/**
 * 系主任
 * CREATED BY yangyifan
 * Date: 2019/11/29
 */
public class DepartApprover extends Approver {
    public DepartApprover(String name) {
        super(name);
    }

    @Override
    void processRequest(PurchaseRequest request) {
        if (request.getPrice() <= 5000) {
            System.out.println("请求编号id=" + request.getId() + " 被" + name + "处理");
        }else {
            nextApprover.processRequest(request);
        }
    }
}
