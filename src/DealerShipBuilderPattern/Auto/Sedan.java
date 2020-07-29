package DealerShipBuilderPattern.Auto;


public abstract class Sedan implements Vehicle {

    @Override
    public EconomyModel economyModel() {

        return new EconomySedan();
    }

}
