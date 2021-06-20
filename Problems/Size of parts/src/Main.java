import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == 1) {
                ++pos;
            } else if (num == -1) {
                ++neg;
            } else {
                ++zero;
            }
        }
        System.out.println(zero + " " + pos + " " + neg);
    }
}