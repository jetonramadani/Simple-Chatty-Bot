//put imports you need here

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        List<String> users = new ArrayList<>();
        while (sc.hasNext()) {
            users.add(sc.next());
        }
        Collections.reverse(users);
        users.forEach(System.out::println);

    }
}