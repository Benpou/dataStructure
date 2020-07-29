package DealerShipBuilderPattern.Auto.Jeep;


public class JeepWrangler extends Jeep {

    @Override
    public int price() {
        return 35000;
    }

    @Override
    public void setPrice(int price) {

    }

    @Override
    public void setYear(int year) {

    }

    @Override
    public String model() {
        return "Wrangler";
    }

    @Override
    public int year() {
        return 2020;
    }

}
