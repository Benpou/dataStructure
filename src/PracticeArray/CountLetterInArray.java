package PracticeArray;

import java.util.Random;

public class CountLetterInArray {
    public static void main(String[] args) {

        char[] arrayOfChar = createArray();
        System.out.println(arrayOfChar);

        System.out.println("The lower case are : " );
        displayArray(arrayOfChar);

        System.out.println("Display counts");
        int[] counts = countLetters(arrayOfChar);
        displayCounts(counts);


    }



    public static char[] createArray() {
      char[] chars = new char[100];
      Random random = new Random();

      for (int i=0;i<chars.length; i++) {
          int num = random.nextInt(26);
          //Narrowing casting which is manual
          chars[i] = (char)(num + 97);
      }
        return chars;
    };

    //display the array of character
    public static void displayArray(char[] chars) {
        for(int i=0; i<chars.length;i++) {
            if((i+1) % 20 == 0) {
                System.out.println(chars[i]);
            } else {
                System.out.print(chars[i] + "  ");
            }
        }
    }

    // Count the occurrence of each letter
    public static int[] countLetters(char[] chars) {
      //Declare and create an array of 26 letter
      int[] counts = new int[26];

      //For each lowercase in array count it
        for (int i=0; i <chars.length ; i++) {
            counts[chars[i] - 'a']++;
        }
        return counts;
    };

    //Display count
    public static void displayCounts(int[] counts) {
        for(int i=0; i<counts.length;i++) {
            if((i+1)%10 == 0) {
                System.out.println(counts[i] + " " + (char)(i+'a'));
            } else {
                System.out.print(counts[i] + " " + (char)(i+'a') + " ");
            }
        }
    }

}
