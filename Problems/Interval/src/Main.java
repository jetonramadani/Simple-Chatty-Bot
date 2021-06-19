import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 19 || n > 14 && n < 17 || n > -15 && n <= 12) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}