import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String searchedBook = scan.nextLine();
        int countBooks = 0;
        boolean isFound = false;
        String command = scan.nextLine();

        while (!command.equals("No More Books")) {
            if (command.equals(searchedBook)) {
                isFound = true;
                break;
            }
            countBooks++;
            command = scan.nextLine();
        }

        if (isFound) System.out.printf("You checked %d books and found it.", countBooks);
        else  System.out.printf("The book you search is not here!%nYou checked %d books.", countBooks);
    }
}
