package cenabrutto;

public class Product {
    private String name;
    private String description;
    private double nettoPrice;
   private String category;
    ;

    public String getCategory() {
        return category;
    }

    public double getNettoPrice() {
        return nettoPrice;
    }

    public Product(String name, String description, double nettoPrice, String category) {
        this.name = name;
        this.description = description;
        this.nettoPrice = nettoPrice;
        this.category = category;


    }
}
