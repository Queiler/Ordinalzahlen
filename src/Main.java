import java.util.Scanner;
public class Main {
    public static String getOrdinal(int zahl) {
        if (zahl >= 11 && zahl <= 13) {
            return zahl + "th";
        }
        switch (zahl % 10) {
            case 1:
                return zahl + "st";
            case 2:
                return zahl + "nd";
            case 3:
                return zahl + "rd";
            default:
                return zahl + "th";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein:");
        int inNum = scanner.nextInt();

        String ordinal = getOrdinal(inNum);
        System.out.println("Die Ordnungszahl ist: " + ordinal);
    }
}