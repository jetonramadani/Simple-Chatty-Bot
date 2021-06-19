import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h = scanner.nextInt();
        int up = scanner.nextInt();
        int down = scanner.nextInt();
        int d = up - down;
        System.out.println((h + up - 2 * down - 1) / d);
    }
}