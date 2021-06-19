import java.util.Scanner;

class Main {
    public static int res(Scanner sc) {
        int num = sc.nextInt();
        return num / 2 + num % 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int res = res(scanner);
        res += res(scanner);
        res += res(scanner);
        System.out.println(res);
    }
}