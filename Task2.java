import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] recepts = new String[n];

        for (int i = 0; i < n; i++)
        {
            recepts[i] = scanner.nextLine();
        }

        int m = scanner.nextInt();
        scanner.nextLine();

        HashMap<String, String> replacements = new HashMap<>();

        for (int i = 0; i < m; i++)
        {
            String[] pair = scanner.nextLine().split(" - ");
            replacements.put(pair[0], pair[1]);
        }

        for (int i = 0; i < n; i++) {
            String line = recepts[i];

            for (Map.Entry<String, String> entry : replacements.entrySet())
            {
                String oldProduct = entry.getKey();
                String newProduct = entry.getValue();

                line = line.replaceAll(oldProduct, newProduct);
                line = line.replaceAll(oldProduct.substring(0, 1).toUpperCase() + oldProduct.substring(1), newProduct.substring(0, 1).toUpperCase() + newProduct.substring(1));
            }

            System.out.println(line);
        }
    }
}
