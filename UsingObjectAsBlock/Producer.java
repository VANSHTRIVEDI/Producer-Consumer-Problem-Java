package Properties_Of_Oops.MultiThreading.Producer_Consumer.UsingObjectAsBlock;

public class Producer implements Runnable {
    private final Company company;

    Producer(Company company) {
        this.company = company;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            try {
                company.add(i);
                i++;
                Thread.sleep(100); // Simulate time taken to produce an item
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
