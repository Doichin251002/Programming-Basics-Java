import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        String typeRoom = scan.nextLine();
        String rate = scan.nextLine();

        int nights = days - 1;
        double price = 0;

        switch (typeRoom) {
            case "room for one person":
                price = 18 * nights;
                break;
            case "apartment":
                price = 25 * nights;
                break;
            case "president apartment":
                price = 35 * nights;
                break;
        }

        if (nights < 10) {
            if (typeRoom.equals("apartment")) price = price - (price * 0.3);
            else if (typeRoom.equals("president apartment")) price = price - (price * 0.1);
        }
        else if (nights <= 15) {
            if (typeRoom.equals("apartment")) price = price - (price * 0.35);
            else if (typeRoom.equals("president apartment")) price = price - (price * 0.15);
        }
        else {
            if (typeRoom.equals("apartment")) price = price - (price * 0.5);
            else if (typeRoom.equals("president apartment")) price = price - (price * 0.2);
        }

        if (rate.equals("positive")) System.out.printf("%.2f", price + (price * 0.25));
        else System.out.printf("%.2f", price - (price * 0.1));
    }
}
