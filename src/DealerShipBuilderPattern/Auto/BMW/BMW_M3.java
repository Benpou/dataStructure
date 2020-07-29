package DealerShipBuilderPattern.Auto.BMW;

import DealerShipBuilderPattern.Auto.Sedan;

public class BMW_M3 extends Sedan {
    @Override
    public int price() {
        return 50000;
    }

    @Override
    public void setPrice(int price) {

    }

    @Override
    public void setYear(int year) {

    }

    @Override
    public String make() {
        return "BMW";
    }

    @Override
    public String model() {
        return "M3";
    }

    @Override
    public int year() {
        return 2020;
    }
}
