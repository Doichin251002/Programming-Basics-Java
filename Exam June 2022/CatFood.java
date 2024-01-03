import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countCats = Integer.parseInt(scan.nextLine());

        double totalFood = 0;
        int smallCats = 0;
        int bigCats = 0;
        int largeCats = 0;

        for (int i = 0; i < countCats; i++) {
            double grFood = Double.parseDouble(scan.nextLine());
            totalFood += grFood;
            if (grFood >= 100 && grFood < 200) smallCats++;
            else if (grFood >= 200 && grFood < 300) bigCats++;
            else largeCats++;
        }
        totalFood /= 1000;
        double pricePerDay = totalFood * 12.45;

        System.out.printf("Group 1: %d cats.%n", smallCats);
        System.out.printf("Group 2: %d cats.%n", bigCats);
        System.out.printf("Group 3: %d cats.%n", largeCats);
        System.out.printf("Price for food per day: %.2f lv.", pricePerDay);
    }
}
