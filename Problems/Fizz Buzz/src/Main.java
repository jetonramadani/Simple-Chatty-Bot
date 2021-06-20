import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (; start <= end; start++) {
            if (start % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (start % 5 == 0) {
                System.out.println("Buzz");
            } else if (start % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(start);
            }
        }
    }
}