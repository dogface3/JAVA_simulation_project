package orientaatiotehtävät_1;

public class SinglePointOfService {
    public static void main(String[] args) {
        ServicePoint servicePoint = new ServicePoint();
        CustomerGenerator.generateCustomers(servicePoint, 5);

        try {
            servicePoint.serve();
            double averageServiceTime = servicePoint.getAverageServiceTime();
            System.out.println("Average Service Time: " + averageServiceTime + " nanoseconds");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
