public class TestSimpleCircle {

    public static void main(String[] args) {
           SimpleCircle circle1 = new SimpleCircle();
           System.out.println("The area of circle is: " + circle1.radious + " and area " + circle1.getArea());

           SimpleCircle circle2 = new SimpleCircle();
           System.out.println("The perimeter is : " + circle2.radious + " result " + circle2.getPerimeter());
    }
}

class SimpleCircle {

    double radious;

    SimpleCircle() {
        radious = 1;
    }

    SimpleCircle(double newRadious) {
        radious = newRadious;
    }

    double getArea() {
        return radious * radious * Math.PI;
    }

    double getPerimeter() {
        return 2 * radious * Math.PI;
    }
}


