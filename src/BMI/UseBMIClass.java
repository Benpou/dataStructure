package BMI;

public class UseBMIClass {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("K B", 40, 190, 70);
        System.out.println("The BMI is " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus() + " age is " + bmi1.getAge());

        BMI bmi2 = new BMI("S K", 35,215, 72);
        System.out.println("The BMI is " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus() + " age is " + bmi2.getAge());
    }
}
