import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int days = scanner.nextInt();
        int foodDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int nightHotel = scanner.nextInt();
        System.out.println(days-- * foodDay + days * nightHotel + 2 * flightCost);
    }
}