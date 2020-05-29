package Circle;

public class TestPassObject {
    public static void main(String[] args) {
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);

        int n = 5;
        printArea(myCircle, n);
        System.out.println("n is : " + n);

    }

    public static void printArea(CircleWithPrivateDataFields c, int times) {
        System.out.println("Radius \t\t Area");
        while (times != 0 ){
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}
