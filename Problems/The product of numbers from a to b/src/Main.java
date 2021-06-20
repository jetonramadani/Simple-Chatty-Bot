import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        long res = 1;
        for (; start < end; start++) {
            res *= start;
        }
        System.out.println(res);
    }
}