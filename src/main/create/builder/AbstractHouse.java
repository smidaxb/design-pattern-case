package main.create.builder;

/**
 * CREATED BY smida
 * Date: 2019/11/16
 */
public abstract class AbstractHouse {
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void buildRoom();
    public void build(){
        buildBasic();
        buildWall();
        buildRoom();
    }

}
