import java.util.Scanner;
public class IT24102235Lab5Q3 {

public static final double Room_Charge_Per_Day = 48000.00;
public static final int Discount10Days = 3;
public static final int Discount20Days = 5;
public static final int Minday =1;
public static final int Maxday = 31;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter start date (1-31): ");
        int StartDate = input.nextInt();
        System.out.print("Enter end date (1-31): ");
        int EndDate = input.nextInt();

        if (StartDate >= EndDate) {
            System.out.println("Error : Start date must be less than end date");
        } else if (StartDate < Minday || StartDate > Maxday || EndDate < Minday || EndDate > Maxday ) {
            System.out.println("Error : Day must be between 1 and 31");
        } else {
            int ReservedDays = EndDate - StartDate;
            int DiscountRate;
            if (ReservedDays < Discount10Days) {
                DiscountRate = 0;
            } else if (ReservedDays < Discount20Days) {
                DiscountRate = 10;
            } else {
                DiscountRate = 20;
            }

            double TotalAmount = ReservedDays * Room_Charge_Per_Day;
            double DiscountAmount = (DiscountRate * TotalAmount) / 100;
            TotalAmount -= DiscountAmount;

            System.out.println("Room Charge Per Day : RS." + Room_Charge_Per_Day + "/=");
            System.out.println("Number of Days Reserved : " + ReservedDays);
            System.out.println("Total Amount to be paid : " + TotalAmount);
        }
    }
}