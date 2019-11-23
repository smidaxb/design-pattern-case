package main.structure.flyWeight.code;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/23
 */
public class ConcreteWebSite extends WebSite {
    /**
     * 网站发布的形式
     */
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("web type =" + type + "," + user.getName() + "is using");
    }
}
