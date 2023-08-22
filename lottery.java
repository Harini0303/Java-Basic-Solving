import java.util.ArrayList;
import java.util.List;

public class LotteryTicketSearch {

    public static boolean isMatchingTicket(int num) {
        String numStr = Integer.toString(num);
        if (numStr.charAt(2) == '7' && numStr.charAt(4) == '7') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> matchingTickets = new ArrayList<>();

        for (int num = 10000; num <= 99999; num++) {
            if (isMatchingTicket(num)) {
                matchingTickets.add(num);
            }
        }

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number to search for matching lottery tickets: ");
        int searchNumber = scanner.nextInt();

        boolean found = false;
        System.out.print("Matching lottery tickets: ");
        for (int ticket : matchingTickets) {
            if (ticket % 10 == searchNumber) {
                System.out.print(ticket + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching lottery tickets found.");
        }
    }
}
