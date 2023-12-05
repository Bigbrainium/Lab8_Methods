import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double itemCost;
        double total = 0;
        boolean keepGoing;

        do {
            itemCost = Helper.getRangedDouble(scan, "What is the price of the item? ($0.50-$9.99)", 0.50, 9.99);
            total += itemCost;
            scan.nextLine();
            keepGoing = Helper.getYNConfirm(scan, "Do you wish to add another item? [Y/N]");

        } while (keepGoing);

        System.out.println("Your total cost is: $" + total);
    }
}
