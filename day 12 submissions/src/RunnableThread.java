class TaskRunner implements Runnable{
    @Override
public void run(){
    for(int i=1;i<=10;i++){
        System.out.println(Thread.currentThread().getName()+" "+i);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
}
public class RunnableThread {
    public static void main(String[] args) {
        TaskRunner tk=new TaskRunner();
        Thread th1=new Thread(tk,"th1");
        Thread th2=new Thread(tk,"th2");

         th1.start();
         th2.start();
    }
}
