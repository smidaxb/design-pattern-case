package main.action.observe.nomal;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/26
 */
public class Client {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);
        weatherData.setData(10,20,30);
    }

}
