package main.create.builder.improve;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/16
 */
public class HighBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼地基");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("高楼屋顶");
    }
}
