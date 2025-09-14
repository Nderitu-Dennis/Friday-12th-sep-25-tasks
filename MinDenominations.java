package friday_tasks_12th_sep;

import static friday_tasks_12th_sep.MovieTicket.scanner;

public class MinDenominations {
    public static void main(String[] args) {
        //notes available
        int[] notes = {2000,500,200,100};

        int amount;
        System.out.println("enter amount: ");
        amount=scanner.nextInt();

        int count = 0;

        for(int note:notes){
            if(amount>=note){
                int numNotes = amount/note;
                System.out.println(numNotes + " * " + note);
                count +=numNotes;
                //get the amount that remained and divide by no of notes
                amount=amount % note;

            }
        }

        System.out.println("Min no of notes: "+ count);

    }
}
