package DealerShipBuilderPattern.Auto;

import DealerShipBuilderPattern.Auto.Jeep.JeepGladiator;

public class BuyCar {
    public static void main(String[] args) {

        Vehicle jeepGladiator2002 = new JeepGladiator(2002, 20000);
        Vehicle jeepGladiator2020 = new JeepGladiator(2020, 70000);
        Vehicle jeepGladiator20202 = new JeepGladiator(2020, 70000);
        Vehicle jeepG = new JeepGladiator();
        jeepG.setPrice(55555);
        jeepG.setYear(2005);

        System.out.println(jeepGladiator2020.equals(jeepGladiator20202));
        System.out.println(jeepGladiator2020.equals(jeepGladiator2020));
        System.out.println(jeepGladiator2002.equals(new Object()));
        System.out.println(jeepG.toString());


    }
}
