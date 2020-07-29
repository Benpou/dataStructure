package DealerShipBuilderPattern.Employees;

public abstract class TypeOfStaff implements Staff {


    @Override
    public Location location() {
        return new WestCostLocation();
    }
}
