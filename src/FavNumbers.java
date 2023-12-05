import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userFavInt = Helper.getInt(scan, "What is your favorite int?");
        double userFavDouble = Helper.getDouble(scan, "What is your favorite double?");

        System.out.println("Your favorite int is: " + userFavInt + " and your favorite double is: " + userFavDouble);
    }
}