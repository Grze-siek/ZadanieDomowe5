package cenabrutto;

public class TestClass {
    public static void main(String[] args) {
        Product produkt1 = new Product("spodnie", "rozmiar 40", 99.0, "0.3");
        Product produkt2 = new Product("koszula", "rozmiar L", 150.99, "0.15");
        Brutto b = new Brutto();
        b.bruttoPrice(produkt1);
        b.bruttoPrice(produkt2);
    }
}
