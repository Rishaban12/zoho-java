import java.util.ArrayList;
import java.util.List;

class Products{
    List<Integer>buffer=new ArrayList<>();
    int capacity=5;
    synchronized void produce(int val){
        while(buffer.size()==capacity){
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        buffer.add(val);
        System.out.println("produce= "+val);
        notify();
    }
    synchronized void consume(){
        while(buffer.size()==0){
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int val=buffer.remove(0);
        System.out.println("consume= "+val);
        notify();
    }

}

public class SharedBuffer {
    public static void main(String[] args) {
        Products product=new Products();
      Thread th1=new Thread(()-> {
          int val=1;
          while(true){
              product.produce(val++);

              try{
                  Thread.sleep(500);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
      });
        Thread th2=new Thread(()-> {
            while(true){
                product.consume();

                try{
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        th1.start();
        th2.start();
    }
}
