package Properties_Of_Oops.MultiThreading.Producer_Consumer.UsingThreadClass;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Producer producer = new Producer(company);
        Consumer consumer = new Consumer(company);
        producer.start();
        consumer.start();
    }

}
