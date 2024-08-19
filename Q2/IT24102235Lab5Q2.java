import java.util.Scanner;
public class IT24102235Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of new members introduced: ");
        int Newmembers = scanner.nextInt();

        if (Newmembers < 0) {
            System.out.println("The input must be a number 0 or greater");
        } else {
            switch (Newmembers) {
                case 0: System.out.println("No Prize");
                break;
                case 1: System.out.println("Prize is a : Pen");
                break;
                case 2: System.out.println("Prize is a : Umbrella");
                break;
                case 3: System.out.println("Prize is a : Bag");
                break;
                case 4: System.out.println("Prize is a : Travelling chair");
                break;
                default: System.out.println("Prize ia a : Headphone");
            }
        }
    }
}