//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        sc.nextInt();
        sc.next();
        sc.nextInt();
        String profession = sc.next();
        System.out.printf("The form for %s is" +
                " completed. We will contact you if " +
                "we need a chef that cooks %s dishes.%n", name, profession);
    }
}