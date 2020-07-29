package DealerShipBuilderPattern.Employees;

import DealerShipBuilderPattern.Employees.Location;

public class WestCostLocation implements Location {

    @Override
    public String whichLocation() {
        return "Los angeles";
    }
}
