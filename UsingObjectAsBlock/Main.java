package Properties_Of_Oops.MultiThreading.Producer_Consumer.UsingObjectAsBlock;

public class Main {
    public static void main(String[] args) {
        Company company = new Company(5); // Capacity of the queue

        Producer producer = new Producer(company);
        Consumer consumer = new Consumer(company);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}
