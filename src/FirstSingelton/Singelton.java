package FirstSingelton;

public class Singelton {
  private static Singelton single_instance = null;

  public String s;

  private Singelton() {
    s = "Hello , I'm starting point of singleton";
  }

  public static Singelton getInstance() {
    if (single_instance == null){
      single_instance = new Singelton();
    }
    return single_instance;
  }

}
