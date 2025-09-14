package friday_tasks_12th_sep;

import static friday_tasks_12th_sep.MovieTicket.scanner;
// to rpt
public class ParkingLot {

    public static void main(String[] args) {
        int vehicleType, hoursParked, amount;

        int totalVehicles = 0;
        int totalRevenue = 0;

        while (true) {
            System.out.println("\nVehicle type charges per hour: \n1. Bike-R.20\n2. Car-R.50\n3. bus-R.100");
            System.out.println("Enter your vehicle type (0 to exit): ");
            vehicleType = scanner.nextInt();

            if (vehicleType == 0) {
                System.out.println("Total vehicles parked: " + totalVehicles);
                System.out.println("Total revenue collected: R." + totalRevenue);
                break;
            }

            if (vehicleType < 1 || vehicleType > 3) {
                System.out.println("Wrong entry!");
                continue; // ask again
            }

            System.out.println("Enter hours parked: ");
            hoursParked = scanner.nextInt();

            if (hoursParked < 0) {
                System.out.println("Hours cannot be negative!");
                continue;
            }

            if (vehicleType == 1)
                amount = hoursParked * 20;
            else if (vehicleType == 2)
                amount = hoursParked * 50;
            else
                amount = hoursParked * 100;

            System.out.println("Amount: R." + amount);

            totalVehicles++;
            totalRevenue += amount;
        }
    }
}
