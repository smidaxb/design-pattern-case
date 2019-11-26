package main.action.observe.improve;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/26
 */
public interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();
}
