package Circle;

public class Test {
    public static void main(String[] args) {
        CircleWithPrivateDataFields myCricle = new CircleWithPrivateDataFields(5.0);
        printCircle(myCricle);
    }
    public static void printCircle(CircleWithPrivateDataFields c) {
        System.out.println("The area of the circle of radius " + c.getRadius()
        + " is " + c.getArea());
    }
}
