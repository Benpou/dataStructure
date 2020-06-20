package PracticeArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class VarsArgsDemoTest {
    VarsArgsDemo subject = new VarsArgsDemo();

    @Test
    void printMax_whenArrayOfIntegerPassToIt_returnMax () {
        double returnvalue = subject.printMax(2, 4, 6, 3, 8, 6, 11, 9);

        assertEquals(returnvalue, 11);
    }

    @Test
    void printMax_whenArrayIsEmpty_returnMinusOne() {
        double returnMinuseOne = subject.printMax();
        assertEquals(returnMinuseOne, -1);
    }
}
