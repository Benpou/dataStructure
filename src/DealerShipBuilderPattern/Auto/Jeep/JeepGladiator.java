package DealerShipBuilderPattern.Auto.Jeep;

import java.util.Objects;

public class JeepGladiator extends Jeep {

    private static final String MODEL = "Gladiator";
    private int price;
    private int year;

    public JeepGladiator() {

    }

    public JeepGladiator(int year, int price){
        this.year = year;
        this.price = price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String model() {
        return MODEL;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public int year() {
        return year;
    }

    @Override
    public String toString() {
        return "Jeep_Gladiator{" +
                "price: " + price +
                ", year: " + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JeepGladiator that = (JeepGladiator) o;
        return price == that.price &&
                year == that.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, year);
    }
}
