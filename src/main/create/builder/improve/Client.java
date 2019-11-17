package main.create.builder.improve;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/16
 */
public class Client {
    public static void main(String[] args) {
        HouseDirector director = new HouseDirector(new HighBuilder());
        House high = director.buildHouse();
        System.out.println(high);

        House commonHouse = House.builder().basic("").roof("").wall("").build();
        House commonHouse1 = House.builder().basic("").roof("").wall("").build();
        System.out.println(commonHouse.hashCode()+"======================"+commonHouse1.hashCode());
        StringBuilder stringBuilder;
    }
}
