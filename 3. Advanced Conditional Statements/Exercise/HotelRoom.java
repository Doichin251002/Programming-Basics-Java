import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;

        if (month.equals("May") || month.equals("October")) {
            studioPrice = 50;
            apartmentPrice = 65;
            if (nights > 14) studioPrice = studioPrice - (studioPrice * 0.3);
            else if (nights > 7) studioPrice = studioPrice - (studioPrice * 0.05);
        }
        else if (month.equals("June") || month.equals("September")) {
            studioPrice = 75.20;
            apartmentPrice = 68.70;
            if (nights > 14) studioPrice = studioPrice - (studioPrice * 0.2);
        }
        else if (month.equals("July") || month.equals("August")) {
            studioPrice = 76;
            apartmentPrice = 77;
        }

        if (nights > 14) apartmentPrice = apartmentPrice - (apartmentPrice * 0.1);

        System.out.printf("Apartment: %.2f lv. %nStudio: %.2f lv.", apartmentPrice * nights, studioPrice * nights);
    }
}
