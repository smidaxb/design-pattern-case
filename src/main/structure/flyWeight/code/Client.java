package main.structure.flyWeight.code;

/**
 * 享元模式
 * CREATED BY yangyifan
 * Date: 2019/11/23
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite netWebSite = factory.getWebSiteCategory("网页");
        netWebSite.use(new User("tom"));
        WebSite blogWebSite1 = factory.getWebSiteCategory("博客");
        blogWebSite1.use(new User("jack"));
        WebSite blogWebSite2 = factory.getWebSiteCategory("博客");
        blogWebSite2.use(new User("smith"));
        WebSite blogWebSite3 = factory.getWebSiteCategory("博客");
        blogWebSite3.use(new User("king"));

        System.out.println("网站的实例数量" + factory.getWebSiteCount());


        //jdk
        //如果Integer.valueOf(x) x在 -128-127，会从享元对象里拿，不在范围内，仍然new


        //小结:
        //1. 在valueOf 方法中，先判断值是否在 IntegerCache 中，如果不在，就创建新的Integer(new), 否则，就直接从 缓存池返回
        //2. valueOf 方法，就使用到享元模式
        //3. 如果使用valueOf 方法得到一个Integer 实例，范围在 -128 - 127 ，执行速度比 new 快

        Integer x = Integer.valueOf(127);
        Integer y = new Integer(127);
        Integer z = 127;
        Integer w = Integer.valueOf(127);

        System.out.println(x.equals(y));
        System.out.println(x == y);
        System.out.println(x == z);
        System.out.println(x == w);
        System.out.println(y == w);
        System.out.println(y == z);
    }
}
