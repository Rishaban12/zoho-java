class OddEven{
    int start=1;
    int end=20;
    public synchronized void odd () {
        while (start<=end) {
            if (start % 2 == 1) {
                System.out.println(start);
                start++;
                try{
                    Thread.sleep(500);
                }
                catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
                notify();
            }

            else{
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }

            }
        }
    }

    public synchronized void even(){
        while(start<=end){
            if(start%2==0) {
                System.out.println(start);
                start++;
                try {

                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                notify();

            }

            else{
                try{
                    wait();
                }
                catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        OddEven oddEven = new OddEven();

        Thread th1 = new Thread(new Runnable() {
            public void run() {
                oddEven.odd();
            }
        });

        Thread th2 = new Thread(new Runnable() {
            public void run() {
                oddEven.even();
            }
        });

        th1.start();
        th2.start();


    }
    }
