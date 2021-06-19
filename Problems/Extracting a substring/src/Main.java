import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name.substring(sc.nextInt(), sc.nextInt() + 1));
    }
}