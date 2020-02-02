package cenabrutto;

public class Brutto {

    void bruttoPrice(Product produkt)
    {
        double bruttoPrice1 = produkt.getNettoPrice()*0.3 + produkt.getNettoPrice();
        double bruttoPrice2 = produkt.getNettoPrice()*0.25 + produkt.getNettoPrice();
        double bruttoPrice3 = produkt.getNettoPrice()*0.2 + produkt.getNettoPrice();
        double bruttoPrice4 = produkt.getNettoPrice()*0.15 + produkt.getNettoPrice();

        switch(produkt.getCategory()){
            case "0.3" :
                System.out.println("Cena brutto: " + bruttoPrice1);
                break;
            case "0.25" :
                System.out.println("Cena brutto: " + bruttoPrice2);
                break;
            case "0.2" :
                System.out.println("Cena brutto: " + bruttoPrice3);
                break;
            case "0.15" :
                System.out.println("Cena brutto: " + bruttoPrice4);
                break;
        }
    }
}
