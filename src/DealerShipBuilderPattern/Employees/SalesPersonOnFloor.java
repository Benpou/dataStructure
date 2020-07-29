package DealerShipBuilderPattern.Employees;

import DealerShipBuilderPattern.Employees.TypeOfStaff;

public class SalesPersonOnFloor extends TypeOfStaff {

    @Override
    public float salary() {
        return (float) 10000.01;
    }

    @Override
    public String gender() {
        return "Male";
    }
}
