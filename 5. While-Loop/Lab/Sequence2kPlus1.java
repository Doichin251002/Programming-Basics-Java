import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int endNum = Integer.parseInt(scan.nextLine());
        int currentNum = 1;

        while (currentNum <= endNum) {
            System.out.println(currentNum);
            currentNum = currentNum * 2 + 1;
        }
    }
}
