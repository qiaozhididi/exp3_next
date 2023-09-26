package iot.app.observer;

/**
 * 观察者
 */
public interface Observer {
    /**
     * 观察目标对象
     * @param sub
     */
    void observe(Subject sub);

    /**
     * 更新目标对象数据
     */
    void update();
}
