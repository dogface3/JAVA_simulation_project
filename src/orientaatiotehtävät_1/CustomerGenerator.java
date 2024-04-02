package orientaatiotehtävät_1;

class CustomerGenerator {
    public static void generateCustomers(ServicePoint servicePoint, int numCustomers) {
        for (int i = 0; i < numCustomers; i++) {
            long currentTime = System.nanoTime();
            Customer customer = new Customer(currentTime);
            servicePoint.addToQueue(customer);
            System.out.println("Customer " + customer.getId() + " added to the queue.");
        }
    }
}


