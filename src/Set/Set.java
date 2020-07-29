package Set;

import java.util.Arrays;

public class Set {
    private int [] array = new int[10];
    private int size = 0 ;

    // add
    boolean add(Integer number) {
        if(number == null) return false;

        if(contains(number)) return false;

        if(size >= array.length ) {
            //array = Arrays.copyOf(array, array.length*2);
            int [] arrayTemp = new int[array.length*2];
            //copy array into arrayTest
            for(int i =0; i < array.length; i++) {
                arrayTemp[i] = array[i];
            }
            array = arrayTemp;
        }
        array[this.size] = number;
        size++;
        return true;
    }
    // remove
    // remove(int number)
    boolean remove(Integer number) {

        if(number == null) return false;

        for(int i=0; i < size(); i++) {
            if (number == array[i]) {
                int temp = array[size() - 1];
                array[i] = temp;
                array[size() -1] = 0;
                size--;

                return true;
            }
        }
        return false;
    }

    //indexOf


    // contains
    boolean contains(Integer number) {
        for(int i = 0 ; i < size ; i++) {
            if(number == array[i]) return true;
        }

        return false;
    }
    // size
    int size() {
        return size;
    }

    // equals
}
