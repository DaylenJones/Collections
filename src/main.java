import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a word, or enter Q to quit: ");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }


            map.put(input, map.getOrDefault(input, 0) + 1);
        }


        int totalWordSum = 0;
        for (var entry : map.entrySet()) {
            totalWordSum += entry.getValue();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Total Word Count: " + totalWordSum);
        sc.close();
    }
}

