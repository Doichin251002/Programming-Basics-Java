import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        if (num == 0) System.out.println();
        else if (num < 100 || num > 200) System.out.println("invalid");
    }
}
