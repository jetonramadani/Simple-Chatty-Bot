import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(k <= m * n &&
                (k % n == 0 || k % m == 0) ? "YES" : "NO");
    }
}