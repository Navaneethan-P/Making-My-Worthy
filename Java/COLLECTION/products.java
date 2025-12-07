public static void main(String[] args) {
    HashMap<String, Integer> products = new HashMap<>();
    products.put("Laptop", 55000);
    products.put("Mouse", 400);
    products.put("Keyboard", 800);
    products.put("Monitor", 12000);
    products.put("Printer", 6000);
    products.put("USB Cable", 150);
    products.put("Webcam", 1100);
    products.put("Speakers", 900);
    products.put("Router", 2500);
    products.put("Pendrive", 450);
    String maxProduct = null;
    int maxPrice = Integer.MIN_VALUE;
    for (Map.Entry<String, Integer> entry : products.entrySet()) {
        if (entry.getValue() > maxPrice) {
            maxPrice = entry.getValue();
            maxProduct = entry.getKey();
        }
    }

    System.out.println("Max product: " + maxProduct + " = " + maxPrice);
    products.remove("Mouse");
    products.put("Keyboard", 1500);
    System.out.println("\nProducts cheaper than 500:");
    for (Map.Entry<String, Integer> entry : products.entrySet()) {
        if (entry.getValue() < 500) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
