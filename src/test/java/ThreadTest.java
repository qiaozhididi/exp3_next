public class ThreadTest {
    public static void main(String[] args) {
        //甲从7数到1
        new Thread(new DecCounter("甲", 7)).start();
        //乙从1数到7
        new Thread(new AscCounter("乙", 7)).start();
    }

    public static class DecCounter implements Runnable {

        private String name;
        private int num;

        public DecCounter(String name, int num) {
            this.name = name;
            this.num = num;
        }

        @Override
        public void run() {
            for (int i = num; i > 0; i--) {
                System.out.println(name + ":" + i);
                try {
                    Thread.sleep(1000);//睡1秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class AscCounter implements Runnable {

        private String name;
        private int num;

        public AscCounter(String name, int num) {
            this.name = name;
            this.num = num;
        }

        @Override
        public void run() {
            //TODO:请完善这里的代码，实现正数计数。
            for (int i = 1; i <= 7; i++) {
                System.out.println(name + ":" + i);
                try {
                    Thread.sleep(1000);//睡1秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}

