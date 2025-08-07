class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println(this.getName() + " " + i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class threadMain {
    public static void main(String[] args) {
        MyThread thread1=new MyThread();
        MyThread thread2=new MyThread();

        thread1.setName("th1");
        thread2.setName("th2");

        thread1.start();
        thread2.start();
    }
}

