package main.create.builder;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/16
 */
public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("为common house打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("为common house砌墙");
    }

    @Override
    public void buildRoom() {
        System.out.println("为common house封顶");
    }
}
