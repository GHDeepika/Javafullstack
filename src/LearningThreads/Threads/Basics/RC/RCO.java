package LearningThreads.Threads.Basics.RC;
class Counter {
    int count = 0;

    public void increment() {
        System.out.println("Increment of Race");
        synchronized (this) {
            count++;
        }
        System.out.println("Race done");
    }
}

public class RCO {
    public static void main(String[] args) throws Exception {

        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count = " + c.count);
    }
}