import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        int studentTickets = 0;
        int standardTickets = 0;
        int kidsTickets = 0;
        int totalTickets = 0;

        while (!command.equals("Finish")) {
            String film = command;
            int capacity = Integer.parseInt(scan.nextLine());
            int countTickets = 0;

            String ticket = scan.nextLine();
            while (!ticket.equals("End")) {
                switch (ticket) {
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidsTickets++;
                        break;
                    default:
                        break;
                }

                countTickets++;
                if (countTickets >= capacity) break;
                ticket = scan.nextLine();
            }

            totalTickets += countTickets;
            System.out.printf("%s - %.2f%% full.%n", film, countTickets * 1.0 / capacity * 100);
            command = scan.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentTickets * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardTickets * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kidsTickets * 1.0 / totalTickets * 100);
    }
}
