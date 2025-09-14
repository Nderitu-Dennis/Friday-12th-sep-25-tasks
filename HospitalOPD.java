package friday_tasks_12th_sep;

import static friday_tasks_12th_sep.MovieTicket.scanner;

public class HospitalOPD {
    public static void main(String[] args) {

        int age, choice;
        String name;
        double discountRate = 0.1;
        double bill=0;
        double totalBill;

        System.out.println("\nDEPT & CONSULTATION FEES\n1. General Physician-R.200\n2. Dentist-R.300" +
                "\n3. Eye specialist-R.250\n4. Dermatologist-R.350\n");

        System.out.print("Patient name: ");
       name = scanner.nextLine();

        System.out.print("Patient age: ");
        age = scanner.nextInt();

        System.out.println("Enter department of choice: ");
        choice = scanner.nextInt();


        switch (choice){
                case 1:
                    bill = 200;
                    break;

                case 2:
                    bill = 300;
                    break;

                case 3:
                    bill = 250;
                    break;

                case 4:
                    bill = 350;
                    break;

                default:
                    System.out.println("Wrong entry");
                    return;
            }

            if(age <12 || age >60){
                totalBill = bill - (bill * discountRate);

            }else{
                totalBill=bill;
            }

            double discount = bill - totalBill;

        System.out.println("**RECEIPT**\nName: " + name + "\nAge: " + age + "\nDiscount: " + discount + "\nTOTAL BILL: " +totalBill);

    }
}









