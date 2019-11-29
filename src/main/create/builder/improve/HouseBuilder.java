package main.create.builder.improve;

/**
 * CREATED BY smida
 * Date: 2019/11/16
 */
public abstract class HouseBuilder {
    private House house = new House();

    public abstract void buildBasic();

    public abstract void buildWall();

    public abstract void buildRoof();

    public House build() {
        buildBasic();
        buildWall();
        buildRoof();
        return house;
    }
}
