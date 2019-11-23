package main.structure.flyWeight.code;

import java.util.HashMap;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/23
 */
public class WebSiteFactory {
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    //根据网站类型，返回一个网站，若没有就创建一个并放入池中，并返回
    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    public int getWebSiteCount() {
        return pool.size();
    }
}
