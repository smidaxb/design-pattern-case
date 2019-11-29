package main.action.responseChain.code;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/29
 */
public class Client {
    public static void main(String[] args) {
        PurchaseRequest request1 = new PurchaseRequest(1, 300, 1);
        PurchaseRequest request2 = new PurchaseRequest(1, 8000, 2);
        PurchaseRequest request3 = new PurchaseRequest(1, 3000000, 3);

        Approver depart = new DepartApprover("系主任");
        Approver college = new CollegeApprover("院长");
        Approver viceSchool = new ViceSchoolMasterApprover("副校长");
        Approver school = new SchoolMasterApprover("校长");

        //处理人需构成环形
        depart.setNextApprover(college);
        college.setNextApprover(viceSchool);
        viceSchool.setNextApprover(school);
        school.setNextApprover(depart);

        depart.processRequest(request1);

        viceSchool.processRequest(request2);

        college.processRequest(request3);
    }



}
