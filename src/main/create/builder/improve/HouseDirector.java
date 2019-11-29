package main.create.builder.improve;

/**
 * CREATED BY smida
 * Date: 2019/11/16
 */
public class HouseDirector {
    private HouseBuilder builder;
    HouseDirector(HouseBuilder builder){
        this.builder = builder;
    }

    public House buildHouse(){
        return builder.build();
    }
}
