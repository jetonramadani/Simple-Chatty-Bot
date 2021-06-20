import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        // put your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(reader.lines().skip(1)
                .mapToInt(Integer::parseInt)
                .filter(num -> num % 6 == 0).sum());
    }
}