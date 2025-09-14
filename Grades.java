package friday_tasks_12th_sep;

public class Grades {
    public String calcGrade(int[] marks) {
        int sum = 0;
        String grade = "";

        for (int m : marks) {
            sum += m;
        }
        System.out.println("Total marks: " + sum);
        int average = sum / 5;

        if (average < 40) {
            grade = "FAIL";
        } else if (average < 60) {
            grade = "D";
        } else if (average < 75) {
            grade = "C";
        } else if (average < 90) {
            grade = "B";
        } else {
            grade = "A";
        }

        System.out.println("Average: " + average + "\nGrade: ");

        return grade;
    }


    public static void main(String[] args) {
        Grades g = new Grades();
        System.out.println(g.calcGrade(new int[]{90,90,90,90,90}));

    }
}
