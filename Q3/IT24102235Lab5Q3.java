import java.util.Scanner;
public class IT24102235Lab5Q3 {

public static final double ROOM_CHARGE_PER_DAY = 48000.00;
public static final int DAYS_FOR_10_PERCENT_DISCOUNT = 3;
public static final int DAYS_FOR_20_PERCENT_DISCOUNT = 5;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter start date (1-31): ");
        int StartDate = input.nextInt();
        System.out.print("Enter end date (1-31): ");
        int EndDate = input.nextInt();

        if (StartDate >= EndDate) {
            System.out.println("Error : Start date must be less than end date");
        } else if (StartDate < 1 || StartDate > 31 || EndDate < 1 || EndDate > 31) {
            System.out.println("Error : Day must be between 1 and 31");
        } else {
            int ReservedDays = EndDate - StartDate;
            int DiscountRate;
            if (ReservedDays < DAYS_FOR_10_PERCENT_DISCOUNT) {
                DiscountRate = 0;
            } else if (ReservedDays < DAYS_FOR_20_PERCENT_DISCOUNT) {
                DiscountRate = 10;
            } else {
                DiscountRate = 20;
            }

            double TotalAmount = ReservedDays * ROOM_CHARGE_PER_DAY;
            double DiscountAmount = (DiscountRate * TotalAmount) / 100;
            TotalAmount -= DiscountAmount;

            System.out.println("Room Charge Per Day : RS." + ROOM_CHARGE_PER_DAY + "/=");
            System.out.println("Number of Days Reserved : " + ReservedDays);
            System.out.println("Total Amount to be paid : " + TotalAmount);
        }
    }
}