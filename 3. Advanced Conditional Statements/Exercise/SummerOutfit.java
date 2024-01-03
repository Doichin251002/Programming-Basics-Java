import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int degree = Integer.parseInt(scan.nextLine());
        String time = scan.nextLine();
        String clothes = "";
        String shoes = "";

        switch (time) {
            case "Morning":
                if (degree >= 10 && degree <= 18) {
                    clothes = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (degree <= 24) {
                    clothes = "Shirt";
                    shoes = "Moccasins";
                } else {
                    clothes = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (degree >= 10 && degree <= 18) {
                    clothes = "Shirt";
                    shoes = "Moccasins";
                } else if (degree <= 24) {
                    clothes = "T-Shirt";
                    shoes = "Sandals";
                } else {
                    clothes = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                if (degree >= 10 && degree <= 18) {
                    clothes = "Shirt";
                    shoes = "Moccasins";
                } else if (degree <= 24) {
                    clothes = "Shirt";
                    shoes = "Moccasins";
                } else {
                    clothes = "Shirt";
                    shoes = "Moccasins";
                }
                break;
        }

        System.out.printf("It's %d degrees, get your %s and %s.", degree, clothes, shoes);
    }
}
