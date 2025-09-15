import java.util.Scanner;

public class ShoppingDiscount{
    
    public double discountCounter(double amount){
        double discountRate;
        double finalBill = 0;
        
        if(amount<1000){
            System.out.println("No discount given");
            
            
        }
        else if(amount<5000){
            discountRate = 0.1;
            finalBill = amount - (discountRate * amount);
        }
        else if(amount<10000){
            discountRate=0.2;
            finalBill = amount - (discountRate * amount);
        }
        else{
            discountRate = 0.3;
            finalBill = amount - (discountRate * amount);
        }
        
        return finalBill;
    }
    
    public static void main (String[] args){
        
        ShoppingDiscount sp = new ShoppingDiscount();
        System.out.println(sp.discountCounter(14000));
        
      
    }
}
