package main.action.responseChain.code;

/**
 * 副校长
 * CREATED BY yangyifan
 * Date: 2019/11/29
 */
public class ViceSchoolMasterApprover extends Approver {
    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    void processRequest(PurchaseRequest request) {
        if (10000 < request.getPrice() && request.getPrice() <= 30000) {
            System.out.println("请求编号id=" + request.getId() + " 被" + name + "处理");
        }else {
            nextApprover.processRequest(request);
        }
    }
}
