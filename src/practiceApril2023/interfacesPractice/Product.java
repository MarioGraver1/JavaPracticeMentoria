package practiceApril2023.interfacesPractice;

public interface Product {

    double getPrice();

    double setPrice(double price);

    String getName();

    void setName(String name);

    String getColor();

    void setColor(String color);

    default String getBarcode(){
     return "no barcode";
    }

}
