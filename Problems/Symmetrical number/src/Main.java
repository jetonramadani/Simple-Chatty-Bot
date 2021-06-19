import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        if (num.charAt(0) == num.charAt(3) && num.charAt(1) == num.charAt(2)) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}