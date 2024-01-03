import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        int max = Integer.MIN_VALUE;
        while (!command.equals("Stop")) {
            int n = Integer.parseInt(command);
            if (n > max) max = n;
            command = scan.nextLine();
        }
        System.out.printf("%d", max);
    }
}
