package DealerShipBuilderPattern.Auto;

public interface Vehicle {
    String make();
    String model();
    int year();
    int price();
    EconomyModel economyModel();

    void setPrice(int price);
    void setYear(int year);
}
