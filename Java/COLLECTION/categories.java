import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> categories = new HashMap<>();
        categories.put("Electronics", new ArrayList<>());
        categories.put("Clothes", new ArrayList<>());
        categories.put("Groceries", new ArrayList<>());
        categories.get("Electronics").add("Phone");
        categories.get("Electronics").add("Laptop");
        categories.get("Electronics").add("Camera");
        categories.get("Clothes").add("Shirt");
        categories.get("Clothes").add("Jeans");
        categories.get("Clothes").add("Jacket");

        categories.get("Groceries").add("Rice");
        categories.get("Groceries").add("Milk");
        categories.get("Groceries").add("Bread");
        String searchProduct = "Laptop";
        String foundCategory = null;

        for (Map.Entry<String, ArrayList<String>> entry : categories.entrySet()) {
            if (entry.getValue().contains(searchProduct)) {
                foundCategory = entry.getKey();
                break;
            }
        }

        if (foundCategory != null) {
            System.out.println(searchProduct + " belongs to " + foundCategory);
        } else {
            System.out.println(searchProduct + " not found in any category");
        }
        String removeProduct = "Jeans";

        for (Map.Entry<String, ArrayList<String>> entry : categories.entrySet()) {
            if (entry.getValue().remove(removeProduct)) {
                System.out.println(removeProduct + " removed from " + entry.getKey());
                break;
            }
        }
        System.out.println("\nFinal Category Data:");
        for (Map.Entry<String, ArrayList<String>> entry : categories.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
