package orientaatiotehtävät_1;

import java.util.LinkedList;

class ServicePoint {
    private LinkedList<Customer> customerQueue;
    private long totalServiceTime;
    private int numCustomersServed;

    public ServicePoint() {
        this.customerQueue = new LinkedList<>();
        this.totalServiceTime = 0;
        this.numCustomersServed = 0;
    }

    public void addToQueue(Customer customer) {
        customerQueue.addLast(customer);
    }

    public Customer removeFromQueue() {
        return customerQueue.removeFirst();
    }

    public void serve() throws InterruptedException {
        while (!customerQueue.isEmpty()) {
            Customer customer = removeFromQueue();
            long waitTime = System.nanoTime() - customer.getStartTime();
            System.out.println("Customer " + customer.getId() + " is being served.");


            long serviceTime = (long) (Math.random() * 4000 + 1000);
            totalServiceTime += serviceTime;
            numCustomersServed++;

            Thread.sleep(serviceTime);

            customer.setEndTime(System.nanoTime());
            long responseTime = waitTime + serviceTime;
            System.out.println("Customer " + customer.getId() + " served. Response Time: " + responseTime + " nanoseconds");
        }
    }

    public double getAverageServiceTime() {
        if (numCustomersServed == 0) {
            return 0;
        }
        return (double) totalServiceTime / numCustomersServed;
    }
}


