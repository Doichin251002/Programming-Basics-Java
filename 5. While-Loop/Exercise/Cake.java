import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int countPieces = length * width;
        String command = scan.nextLine();

        while (!command.equals("STOP")) {
            int currentPieces = Integer.parseInt(command);
            countPieces -= currentPieces;

            if (countPieces < 0) break;
            command = scan.nextLine();
        }

        if (countPieces < 0) System.out.printf("No more cake left! You need %d pieces more.", Math.abs(countPieces));
        else System.out.printf("%d pieces are left.", countPieces);
    }
}
