import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        System.out.println(IntStream.rangeClosed(sc.nextInt(), sc.nextInt())
                .sum());
    }
}