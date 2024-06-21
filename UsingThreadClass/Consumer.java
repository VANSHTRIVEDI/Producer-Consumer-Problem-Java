package Properties_Of_Oops.MultiThreading.Producer_Consumer.UsingThreadClass;

public class Consumer extends Thread {
    Company t;

    Consumer(Company obj) {
        this.t = obj;
    }

    public void run() {
        int i = 0;
        while (i++ <= 10) {
            try {
                this.t.consume();
            } catch (Exception e) {

                e.printStackTrace();
            }
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }
    }
}
