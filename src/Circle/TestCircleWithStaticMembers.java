package Circle;

public class TestCircleWithStaticMembers {

    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of circle obj is " + CircleWithStaticMembers.numberOfObjects);

        //create C1
        CircleWithStaticMembers c1 = new CircleWithStaticMembers();

        System.out.println("after creating C1");
        System.out.println("The number of circle obj is  c1 " + c1.numberOfObjects);

        // create C2
        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);

        //Modify C1
        c1.radius = 9;

        // display c1 and c2 after cs was created
        System.out.println("\n After creating c2 and modifying c1");
        System.out.println("c1: radius ( " + c1.radius + " ) and number of objs are " + c1.numberOfObjects);
        System.out.println("c1: radius ( " + c2.radius + " ) and number of objs are " + c2.numberOfObjects);




    }
}
