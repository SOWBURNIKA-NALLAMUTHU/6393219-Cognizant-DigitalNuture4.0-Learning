//Product class

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public void display() {
        System.out.println("ID: " + productId + ", Name: " + productName + ", Category: " + category);
    }
}

public class ECommerceSearch {

    // Linear Search - O(n)
    public static Product linearSearch(Product[] products, int idToFind) {
        for (Product product : products) {
            if (product.productId == idToFind) {
                return product;
            }
        }
        return null;
    }

    // Binary Search - O(log n)
    public static Product binarySearch(Product[] products, int idToFind) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].productId == idToFind) {
                return products[mid];
            } else if (products[mid].productId < idToFind) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    // Main method
    public static void main(String[] args) {

        Product[] unsortedProducts = {
                new Product(104, "Keyboard", "Electronics"),
                new Product(101, "Book", "Stationery"),
                new Product(105, "Shoes", "Fashion"),
                new Product(102, "Laptop", "Electronics")
        };

        Product[] sortedProducts = {
                new Product(101, "Book", "Stationery"),
                new Product(102, "Laptop", "Electronics"),
                new Product(104, "Keyboard", "Electronics"),
                new Product(105, "Shoes", "Fashion")
        };

        int searchId1 = 102;
        Product resultLinear = linearSearch(unsortedProducts, searchId1);
        System.out.println("Linear Search Result:");
        if (resultLinear != null) {
            resultLinear.display();
        } else {
            System.out.println("Product with ID " + searchId1 + " not found.");
        }

        int searchId2 = 101;
        Product resultBinary = binarySearch(sortedProducts, searchId2);
        System.out.println("Binary Search Result:");
        if (resultBinary != null) {
            resultBinary.display();
        } else {
            System.out.println("Product with ID " + searchId2 + " not found.");
        }
    }
}