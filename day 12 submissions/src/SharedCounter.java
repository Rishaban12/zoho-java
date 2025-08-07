import sun.awt.windows.ThemeReader;

 class Counter {
    int counter = 0;

    synchronized void increment() {
        counter++;
    }
}
public class SharedCounter{
    public static void main(String[] args) {
           Counter count=new Counter();

        Thread th1=new Thread(()->{
                for(int i=1;i<=1000;i++) {
                    count.increment();
                } });
        Thread th2=new Thread(()->{
            for(int i=1;i<=1000;i++) {
                count.increment();
            } });
        Thread th3=new Thread(()->{
            for(int i=1;i<=1000;i++) {
                count.increment();
            } });

        th1.start();
        th2.start();
        th3.start();

        try{
            th1.join();
            th2.join();
            th3.join();
        } catch (InterruptedException e) {
            System.out.println("error");
        }
        System.out.println("counter: "+count.counter);
    }
}
