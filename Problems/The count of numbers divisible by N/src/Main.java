import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        long total = IntStream.range(a, b + 1)
                .filter(num -> num % n == 0)
                .count();
        System.out.println(total);
    }
}