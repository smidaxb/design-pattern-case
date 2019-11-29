package main.action.responseChain.code;

/**
 * 院长
 * CREATED BY yangyifan
 * Date: 2019/11/29
 */
public class CollegeApprover extends Approver {
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    void processRequest(PurchaseRequest request) {
        if (5000 < request.getPrice() && request.getPrice() <= 10000) {
            System.out.println("请求编号id=" + request.getId() + " 被" + name + "处理");
        }else {
            nextApprover.processRequest(request);
        }
    }
}
