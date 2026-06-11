package LearningThreads.Threads.Basics;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        //System.out.println("Hello world");
        //System.out.println(Thread.currentThread().getName());

        System.out.println("Creation of thread");
        MyThreads t=new MyThreads();
        //System.out.println(t.getState());
        //System.out.println(t.getState());
        t.start();

        for(int i=1;i<=3;i++){
            t.join();
            System.out.println(i);
        }


    }

}