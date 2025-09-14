package friday_tasks_12th_sep;

public class ElectricityUsageBill {
    public double electricityBill(int units){
        double band1=100 * 3;
        double band2 = 100 * 5;
        double bill=0;

        if(units<0){
            return 0;
        }
        else if(units<=100){
            bill=units * 3;
        } else if (units <=200) {
            bill = band1 + (units-100)* 5;

        } else {
            bill= band1 + band2 + (units-200)* 7;
        }
        return bill;

    }
    public static void main(String[] args) {
        ElectricityUsageBill e = new ElectricityUsageBill();
        System.out.println(e.electricityBill(0));

    }
}
