public class ProductRating {
    public static void main(String[] args) {

        int[][] ratings = {
            {4, 5, 4}, // Customer 1
            {3, 5, 3}, // Customer 2
            {4, 5, 3}, // Customer 3
            {1, 2, 1}  // Customer 4
        };

        int customers = ratings.length;         
        int criteria = ratings[0].length;       

        double[] avgCriteria = new double[criteria];
        double[] avgCustomer = new double[customers];

        for (int col = 0; col < criteria; col++) {
            double sum = 0;
            for (int row = 0; row < customers; row++) {
                sum += ratings[row][col];
            }
            avgCriteria[col] = sum / customers;
        }

        for (int row = 0; row < customers; row++) {
            double sum = 0;
            for (int col = 0; col < criteria; col++) {
                sum += ratings[row][col];
            }
            avgCustomer[row] = sum / criteria;
        }

        System.out.println("Rating\tProduct\tPackage\tDelivery");

        System.out.printf("Average\t%.2f\t%.2f\t%.2f%n", avgCriteria[0], avgCriteria[1], avgCriteria[2]);
        System.out.println();

        for (int i = 0; i < customers; i++) {
            System.out.printf("Customer %d provide the average rating %.2f%n", (i + 1), avgCustomer[i]);
        }
    }
}
