package Circle;

public class CircleWithPrivateDataFields {
     private double radius = 1;

    private static int numberOfObjects = 0;

    public CircleWithPrivateDataFields() {
        numberOfObjects++;
    }

    // Construct a circle with a specific radius
    public CircleWithPrivateDataFields(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    //Return radius
    public double getRadius() {
        return radius;
    }

    //Set a new radius
    public void setRadius(double newRadius){
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    //Return numberOfObjects
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    //Return the area
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
