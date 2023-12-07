import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Print your message: ");
        String msg = scan.nextLine();
        Helper.prettyHeader(msg);
    }
}
