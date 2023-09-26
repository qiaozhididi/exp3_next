package iot.app.observer;

/**
 * 目标对象
 */
public interface Subject {

    /**
     * 关联观察者
     *
     * @param obs
     */
    void attach(Observer obs);

    /**
     * 通知所有观察者
     */
    void notifyObservers();

    /**
     * 获取数据
     *
     * @return
     */
    Object getData();

}
