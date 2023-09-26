package iot.app.observer;

/**
 * 读者
 */
public class Reader implements Observer {

    private Subject sub;
    public String name;

    public Reader(String name) {
        this.name = name;
    }

    /**
     * 观察
     *
     * @param sub
     */

    @Override
    public void observe(Subject sub) {
        this.sub = sub;
        sub.attach(this);
    }

    /**
     * 更新目标对象数据
     */
    @Override
    public void update() {
        System.out.println(name + "收到" + sub.getData());
    }

}
