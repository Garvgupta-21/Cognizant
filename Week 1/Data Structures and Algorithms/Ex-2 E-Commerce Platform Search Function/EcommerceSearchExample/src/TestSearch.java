public class TestSearch {

    public static void main(String[] args) {

        Product[] products = {
            new Product(1, "iPhone", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Laptop", "Electronics"),
            new Product(4, "Watch", "Accessories")
        };

        Product result1 = LinearSearch.search(products, "Laptop");
        System.out.println("Linear Search: " + (result1 != null ? result1.productName : "Not Found"));

        Product result2 = BinarySearch.search(products, "Laptop");
        System.out.println("Binary Search: " + (result2 != null ? result2.productName : "Not Found"));
    }
}