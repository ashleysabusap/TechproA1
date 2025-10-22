import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();
        int maxItems = 5;
        System.out.println("Enter up to 5 items to buy:");
        while (shoppingList.size() < maxItems) {
            System.out.print("Item " + (shoppingList.size() + 1) + ": ");
            String item = scanner.nextLine();

            if (!item.isEmpty()) {
                shoppingList.add(item);
            } else {
                System.out.println("Item cannot be empty. Try again.");
            }
        }
        System.out.println("\nYour shopping list:");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println("- " + shoppingList.get(i));
        }
        System.out.println("You entered " + shoppingList.size() + " items.");
        System.out.print("\nSearch for an item: ");
        String searchItem = scanner.nextLine().toLowerCase();

        boolean found = false;
        for (String item : shoppingList) {
            if (item.toLowerCase().equals(searchItem)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchItem + " is in your shopping list!");
        } else {
            System.out.println(searchItem + " is NOT in your shopping list.");
        }

        scanner.close();
    }
}
