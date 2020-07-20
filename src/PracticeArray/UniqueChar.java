
package PracticeArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueChar {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please Enter your string");
//        String str = input.next();


        Animal tiger = new Tiger();
        Animal turtle = new Turtle();
        Animal horse = new Horse();
        System.out.println(speed(tiger));
        System.out.println(speed(turtle));
        System.out.println(speed(horse));

        String b = "a";
        b += "c";
        b += "d";
        StringBuilder bb = new StringBuilder("a");
        bb.append("bb");

    }

    static int speed(Animal animal) {
        return animal.run();
    }

    boolean isUniqueChars(String str) {
        if (str.length() > 128) {
            return false;
        }
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}
