package friday_tasks_12th_sep;

import java.util.Scanner;
public class Restaurant {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double bill=0;
        double GSTrate=0.05;
        double totalBill=0;
        int choice, quantity;

      while (true) {

            System.out.println("\nMENU\n1-> Pizza R.250\n2-> Burger R.120" +
                    "\n3-> Sandwich R.100\n4-> Cold Drink R.50\n5-> Exit");

            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid entry");
                continue;

            } else if(choice ==5){
                System.out.println("exiting...");
                return;
            }

            System.out.print("Enter quantity: ");
            quantity = scanner.nextInt();


            switch (choice) {
                case 1:
                    bill = 250 * quantity;
                    break;

                case 2:
                    bill = 120 * quantity;
                    break;

                case 3:
                    bill = 100 * quantity;
                    break;

                case 4:
                    bill = 50 * quantity;
                    break;
            }


            totalBill += bill;
            double netBill = totalBill + (totalBill * GSTrate);
            System.out.println("TOTALBill: " + totalBill + "\nTotal bill after GST: " + netBill);
        }}
}









