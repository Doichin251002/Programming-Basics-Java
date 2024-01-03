package June2021;

import java.util.Scanner;

public class FilmPremiere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String film = scan.nextLine();
        String consume = scan.nextLine();
        int countTickets = Integer.parseInt(scan.nextLine());

        double price = countTickets;

        switch (film) {
            case "John Wick":
                if (consume.equals("Drink"))
                    price *= 12;
                else if (consume.equals("Popcorn"))
                    price *= 15;
                else
                    price *= 19;
                break;
            case "Star Wars":
                if (consume.equals("Drink"))
                    price *= 18;
                else if (consume.equals("Popcorn"))
                    price *= 25;
                else
                    price *= 30;

                if (countTickets >= 4) price -= price * 0.3;
                break;
            case "Jumanji":
                if (consume.equals("Drink"))
                    price *= 9;
                else if (consume.equals("Popcorn"))
                    price *= 11;
                else
                    price *= 14;

                if (countTickets == 2) price -= price * 0.15;
                break;
        }
        System.out.printf("Your bill is %.2f leva.", price);
    }
}
