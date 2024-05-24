//creating our thread using runnable interface

class MyThread implements Runnable {
    public void run() {
        // task for thread
        for (int i = 0; i <= 10; i++) {
            System.out.println("Child Thread : " + i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }

        }
    }

public static void main(String[] args) {
    //creating object of our thread
    MyThread t1 = new MyThread();
    //creating thread
    Thread th = new Thread(t1);
    th.start();

    //object of another thread

    MyAnotherThread t2 = new MyAnotherThread();
    t2.start();
}
}
