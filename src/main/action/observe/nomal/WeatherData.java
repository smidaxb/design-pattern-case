package main.action.observe.nomal;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/26
 */
public class WeatherData {
    private float t;
    private float p;
    private float h;
    private CurrentConditions currentConditions;

    WeatherData( CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public void dataChange() {
        currentConditions.update(t, p, h);
    }

    public void setData(float t, float p, float h) {
        this.t = t;
        this.p = p;
        this.h = h;
        dataChange();
    }
}
