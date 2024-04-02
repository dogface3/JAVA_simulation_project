package orientaatiotehtävät_1;

public class ServicePointTest {
    public static void main(String[] args) {
        int numRuns = 5;

        for (int i = 1; i <= numRuns; i++) {
            System.out.println("Run #" + i);
            ServicePoint servicePoint = new ServicePoint();
            int numCustomers = (int) (Math.random() * 10) + 1;
            CustomerGenerator.generateCustomers(servicePoint, numCustomers);
            try {
                servicePoint.serve();
                double averageServiceTime = servicePoint.getAverageServiceTime();
                System.out.println("Average Service Time: " + averageServiceTime + " nanoseconds");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
    }
}
