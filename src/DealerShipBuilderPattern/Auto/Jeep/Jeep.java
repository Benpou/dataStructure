package DealerShipBuilderPattern.Auto.Jeep;

import DealerShipBuilderPattern.Auto.Sedan;

public abstract class Jeep extends Sedan {


    private static final String MAKE = "Jeep";
    @Override
    public String make() {
        return MAKE;
    }

}
