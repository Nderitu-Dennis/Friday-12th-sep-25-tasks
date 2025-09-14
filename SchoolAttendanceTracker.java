package friday_tasks_12th_sep;

public class SchoolAttendanceTracker {
    public void attendanceTracker(char[] arr){
        int present=0;
        int absent=0;
        int late=0;

//        loop thru and count the days
        for(char c : arr){
            if(c== 'P')
                present++;
            else if (c=='A')
                absent++;
            else if(c=='L')
                late++;
            }

//        print the no. of corresponding days
        System.out.println("days absent: " + absent);
        System.out.println("days present: " + present);
        System.out.println("days late: " + late);

//        check conditions
        System.out.println("\nDECISION: ");
        if(absent>10)
            System.out.println("Student detained");
        else if(late>5)
            System.out.println("Student to get a warning");
        else
            System.out.println("Student is eligible for exam");

        }


       public static void main(String[] args) {
        SchoolAttendanceTracker s = new SchoolAttendanceTracker();
        s.attendanceTracker(new char[]{'P','P','L','A','L','L','L','L','L','L','A','A','A','A'});
    }
}
