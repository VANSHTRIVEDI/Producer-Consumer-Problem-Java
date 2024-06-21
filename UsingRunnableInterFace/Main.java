package Properties_Of_Oops.MultiThreading.Producer_Consumer.UsingRunnableInterFace;

public class Main {
    public static void main(String[] args) {
        Company obj = new Company();

        // we can use lamba function so we dont have to make a saperate produce and
        // consume class
        Runnable task1 = () -> {
            for (int i = 0; i < 1000; i++) {
                try {
                    obj.produce(i);
                    Thread.sleep(1000);
                } catch (Exception e) {

                    e.printStackTrace();
                }
            }
        };
        Runnable task2 = () -> {
            for (int i = 0; i < 1000; i++) {
                try {
                    obj.consume();
                    Thread.sleep(1000);
                } catch (Exception e) {

                    e.printStackTrace();
                }
            }
        };
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();
    }

    // we can use traditionally like this
    // Runnable task = new Runnable() {
    // @Override
    // public void run() {
    // for (int i = 0; i < 1000; i++) {
    // try {
    // obj.produce(i);
    // Thread.sleep(1000);
    // } catch (Exception e) {

    // e.printStackTrace();
    // }
    // }
    // }
    // };

    // or if want we can create seperate class for consumer and producer
    // and make their object and set it into threads than call
    // Company company =new company();
    // Producer p =new Producer(company);
    // Thread t1=new Thread(p);
    // t1.start();

}
