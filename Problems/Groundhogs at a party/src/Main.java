import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        boolean res1 = num >= 10 && num <= 20 && !weekend;
        boolean res2 = num >= 15 && num <= 25 && weekend;
        System.out.println(res1 || res2);
    }
}