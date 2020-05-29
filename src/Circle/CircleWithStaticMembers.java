package Circle;

public class CircleWithStaticMembers {
    double radius;

    // The number of obj created
    static int numberOfObjects = 0;

    //Construct a circle with radius 1
    CircleWithStaticMembers() {
        radius = 1;
        numberOfObjects++;
    }

    //Construct a circle with specific radius
    CircleWithStaticMembers(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    //Return number of objects
    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    //Return the area of circle
    double getArea() {
        return radius * radius * Math.PI;
    }
}
