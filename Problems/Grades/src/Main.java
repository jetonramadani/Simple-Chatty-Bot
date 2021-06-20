import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int[] grades = new int[4];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            grades[sc.nextInt() - 2]++;
        }
        for (int num : grades) {
            System.out.print(num + " ");
        }
    }
}