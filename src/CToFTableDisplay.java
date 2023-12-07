public class CToFTableDisplay {
    public static void main(String[] args) {
        System.out.printf("%-15s %11s", "Celsius:", "Fahrenheit:");
        for (double i = -100; i < 101; i++) {
            System.out.printf("\n%-15.2f %5.2f", i, Helper.CtoF(i));
        }
    }
}
