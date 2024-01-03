import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        int min = Integer.MAX_VALUE;
        while (!command.equals("Stop")) {
            int n = Integer.parseInt(command);
            if (n < min) min = n;
            command = scan.nextLine();
        }
        System.out.printf("%d", min);
    }
}
