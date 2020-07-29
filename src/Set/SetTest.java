package Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {
    private Set subject;

    @BeforeEach
    void setUp() {
        subject = new Set();
    }

    @Test
    void add_shouldAddANewItem() {
        boolean returnValue = subject.add(1);

        assertTrue(returnValue);
    }

    @Test
    void add_shouldNotBeAbleToAddNull() {
        boolean returnValue = subject.add(null);

        assertFalse(returnValue);
    }

    @Test
    void add_shouldNotAddDupplicate() {
        boolean returnValue = subject.add(1);

        assertTrue(returnValue);

        returnValue = subject.add(1);

        assertFalse(returnValue);
    }

    @Test
    void add_shouldAddAsMuchAsNeeded() {

        for(int i=1; i < 20; i++) {
            subject.add(i);
        }
        assertEquals(subject.size(), 19);
    }

    @Test
    void size_shouldAddANewItem_AndSizeHasToIncrease() {
        subject.add(1);

        assertEquals(subject.size(), 1);
    }

    @Test
    void size_shouldAddANewItem_AndSizeHasToIncreaseOnlyIfAdded() {
        subject.add(1);
        subject.add(2);
        subject.add(null);

        assertEquals(subject.size(), 2);
    }

    @Test
    void contains_shouldAddANewItem_AndItShouldContainsTheNumberIAdded() {
        boolean returnValue = subject.add(1);

        assertTrue(subject.contains(1));
    }

    @Test
    void contains_shouldNotReturnTrueWhenItIsNotInTheSet() {

        assertFalse(subject.contains(1));
    }

    @Test
    void remove_shouldRemoveNumber() {
        //set up
        subject.add(1);
        subject.add(2);
        //calling the subject (remove in this case)
        assertEquals(subject.size(), 2);
        assertTrue(subject.contains(2));
        boolean checkReturn = subject.remove(2);
        //expectation
        assertEquals(subject.size(), 1);
        assertFalse(subject.contains(2));
        assertTrue(checkReturn);
    }

    @Test
    void remove_shouldReturnFalseIfThereIsNoNumberExists() {

        boolean returnFalse = subject.remove(3);
        assertFalse(returnFalse);
    }

    @Test
    void remove_whenNullPass_shouldReturnFalse() {

        subject.add(1);

        boolean returnFalse = subject.remove(null);
        assertFalse(returnFalse);
    }

}
