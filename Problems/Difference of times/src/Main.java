import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int start = scanner.nextInt() * 3600;
        start += scanner.nextInt() * 60 + scanner.nextInt();
        int end = scanner.nextInt() * 3600;
        end += scanner.nextInt() * 60 + scanner.nextInt();
        System.out.println(end - start);
    }
}