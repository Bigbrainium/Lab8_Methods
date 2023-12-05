import java.util.Scanner;

public class RegExMagic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String SSN;
        String StudentMNum;
        String menuOption;

        SSN = Helper.getRegExString(scan, "What is your Social Security Number? [xxx-xx-xxxx]","\\d{3}-\\d{2}-\\d{4}");

        System.out.println("Your Social Security Number is: " + SSN);
        System.out.println(" ");

        StudentMNum = Helper.getRegExString(scan, "What is Your UC Student M number? [Mxxxxx]", "(M|m)\\d{5}");

        System.out.println("Your Student M Number is: " + StudentMNum);
        System.out.println(" ");

        menuOption = Helper.getRegExString(scan, "Menu:  O - Open  S - Save  V - View  Q - Quit", "[OoSsVvQq]");

        System.out.println("You chose: " + menuOption);
    }
}
