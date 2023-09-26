package iot.app.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * 报社
 */
public class PaperOffice implements Subject, Runnable {


    private String paper;

    private List<Observer> obsList = new LinkedList<>();

    @Override
    public void attach(Observer obs) {
        obsList.add(obs);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : obsList) {
            obs.update();
        }
    }

    @Override
    public Object getData() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    @Override
    public void run() {
        String[] ps = new String[]{"周一晚报", "周二晚报", "周三晚报", "周四晚报", "周五晚报", "周六晚报", "周日晚报"};
        int i = 0;
        while (i < ps.length) {
            //  TODO:请完善此方法
            try {
                System.out.println("-----收到" + ps[i] + "-----");
                setPaper(ps[i]);
                notifyObservers();
                i++;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        PaperOffice po = new PaperOffice();
        Reader a = new Reader("甲");//读者甲
        Reader b = new Reader("乙");//读者乙
        a.observe(po);//甲观察报社
        b.observe(po);//乙观察报社
        new Thread(po).start();
    }
}
