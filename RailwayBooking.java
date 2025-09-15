import java.util.Scanner;

public class RailwayBooking{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int numTickets,option;
        double amount=0;
        double totalamount=0;
        int totalTickets=0;
        
        while(true){
        System.out.println("\nTICKETS:\n1->Sleeper(R.300 per seat)\n2->AC(R500 per seat)\n3->General (R.150 per seat)\n4->Exit booking system");
        
        System.out.println("\nSelect Ticket Option: ");
        option=scanner.nextInt();
        
          if(option <1 || option >4){
            System.out.println("Invalid entry");
            continue;
            
        } else if(option == 4) {
            System.out.println("exiting booking system..");
            return;
        }
        
        System.out.println("Enter number of tickets: ");
        numTickets=scanner.nextInt();
        
      
        
        switch(option){
            case 1:
                amount=300 * numTickets;
                break;
            case 2:
                amount=500 * numTickets;
                break;
            case 3:
                amount=150 * numTickets;
                break;
           
                    
        }
        
        totalTickets+=numTickets;
        totalamount+=amount;
        System.out.println("TICKETS: " + numTickets + "\nTOTAL TICKETS: " + totalTickets + "\n AMOUNT: " + amount + "\nTOTAL AMOUNT: " + totalamount);
        
        
    }}
}
