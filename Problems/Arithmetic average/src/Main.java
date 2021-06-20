import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(IntStream.rangeClosed(start, end)
                .filter(num -> num % 3 == 0)
                .average().getAsDouble());
    }
}