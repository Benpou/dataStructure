package FirstSingelton;

public class Main {
  public static void main(String[] args) {
    //instantiating Singelton classwith variable x
    Singelton x = Singelton.getInstance();

    // instantioating Singelton class with variable y
    Singelton y = Singelton.getInstance();

    //instantiating Singelton class with variable z
    Singelton z = Singelton.getInstance();

    x.s = (x.s).toUpperCase();

    System.out.println("String from x is " + x.s);
    System.out.println("String from y is " + y.s);
    System.out.println("String from z is " + z.s);
    System.out.println("\n\n");


    //changing variable of instance z
    z.s = (z.s).toLowerCase();

    System.out.println("String from x is " + x.s);
    System.out.println("String from y is " + y.s);
    System.out.println("String from z is " + z.s);
  }

}
