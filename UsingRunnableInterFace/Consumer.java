package Properties_Of_Oops.MultiThreading.Producer_Consumer.UsingRunnableInterFace;

public class Consumer implements Runnable {
    Company c;

    Consumer(Company obj) {
        this.c = obj;
    }

    @Override
    public void run() {
        int i = 0;
        while (i++ <= 10) {
            try {
                this.c.consume();
            } catch (Exception e) {

                e.printStackTrace();
            }
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}
