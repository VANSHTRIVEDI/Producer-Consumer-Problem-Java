package Properties_Of_Oops.MultiThreading.Producer_Consumer.UsingObjectAsBlock;

public class Consumer implements Runnable {
    private final Company company;

    Consumer(Company company) {
        this.company = company;
    }

    @Override
    public void run() {
        while (true) {
            try {
                company.remove();
                Thread.sleep(150); // Simulate time taken to consume an item
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
