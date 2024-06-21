package Properties_Of_Oops.MultiThreading.Producer_Consumer.UsingRunnableInterFace;

public class Producer implements Runnable {

    Company p;

    Producer(Company obj) {
        this.p = obj;
    }

    public void run() {
        int i = 0;
        while (i++ <= 10) {
            try {
                this.p.produce(i);
            } catch (Exception e) {

                e.printStackTrace();
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

}