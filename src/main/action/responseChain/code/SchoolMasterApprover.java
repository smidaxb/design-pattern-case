package main.action.responseChain.code;

/**
 * 校长
 * CREATED BY yangyifan
 * Date: 2019/11/29
 */
public class SchoolMasterApprover extends Approver {
    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    void processRequest(PurchaseRequest request) {
        if (30000 < request.getPrice()) {
            System.out.println("请求编号id=" + request.getId() + " 被" + name + "处理");
        }else {
            nextApprover.processRequest(request);
        }
    }
}
