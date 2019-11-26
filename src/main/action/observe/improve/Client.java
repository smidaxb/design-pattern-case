package main.action.observe.improve;

import java.util.Observable;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/26
 */
public class Client {
    public static void main(String[] args) {
        WeatherData subject = new WeatherData();

        Observer observer = new CurrentConditions("默认观察者");
        Observer baidu = new Baidu("baidu");
        subject.registerObserver(observer);
        subject.registerObserver(baidu);

        subject.setData(10,20,30);

        subject.removeObserver(observer);
        subject.setData(20,30,40);

        //jdk
        Observable observable;
    }



}
