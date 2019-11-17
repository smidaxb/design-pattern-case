package main.create.singleton;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/3
 */
public enum EnumSingleton {
    INSTANCE("danli");
    private String str;

    private EnumSingleton(String str) {
        this.str = str;
    }

    public String printFiledStr() {
        return "str=" + str;
    }
}
