import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        System.out.println(IntStream.generate(scanner::nextInt)
                .limit(3)
                .filter(i -> i > 0)
                .count() == 1);
    }
}