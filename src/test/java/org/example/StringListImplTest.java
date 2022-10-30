package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.example.StringListImplTestConstants.*;
import static org.junit.jupiter.api.Assertions.*;

class StringListImplTest {

    StringListImpl stringArrayList = new StringListImpl(10);

    @BeforeEach
    void clearArray() {
        stringArrayList.clear();
    }

    @Test
    void addItemPositiveTest() {
        String actual1 = stringArrayList.add(ONE);
        String actual2 = stringArrayList.add(TWO);

        assertEquals(ONE, actual1);
        assertEquals(TWO, actual2);

        assertTrue(stringArrayList.size() == 2);
    }

    @Test
    void addByIndexPositiveTest() {
        fillArray();

        String actual1 = stringArrayList.add(0, ONE);

        assertEquals(ONE, actual1);
    }

    @Test
    void addByIndexNegativeTest() {
        assertThrows(InvalidIndexException.class, () -> stringArrayList.add(-1, ONE));
    }

    @Test
    void setPositiveTest() {
        stringArrayList.add(ONE);
        String actual = stringArrayList.set(0, TWO);
        assertEquals(TWO, actual);
    }

    @Test
    void removeItemPositiveTest() {
        stringArrayList.add(ONE);
        assertFalse(stringArrayList.isEmpty());
        stringArrayList.remove(ONE);
        assertTrue(stringArrayList.isEmpty());
    }

    @Test
    void removeByIndexPositiveTest() {
        stringArrayList.add(ONE);
        stringArrayList.add(TWO);

        assertFalse(stringArrayList.isEmpty());
        stringArrayList.remove(0);
        stringArrayList.remove(0);
        assertTrue(stringArrayList.isEmpty());
    }

    @Test
    void containsPositiveTest() {
        stringArrayList.add(ONE);

        assertTrue(stringArrayList.contains(ONE));
        assertFalse(stringArrayList.contains(TWO));
    }

    @Test
    void lastIndexOfPositiveTest() {
        stringArrayList.add(ONE);
        stringArrayList.add(ONE);
        assertTrue(stringArrayList.lastIndexOf(ONE) == 1);
        assertTrue(stringArrayList.lastIndexOf(TWO) == -1);
    }

    @Test
    void getPositiveTest() {
        stringArrayList.add(ONE);
        stringArrayList.add(TWO);
        String actual = stringArrayList.get(1);
        assertEquals(TWO, actual);
    }

    @Test
    void equalsPositiveTest() {
        stringArrayList.add(ONE);
        stringArrayList.add(TWO);

        StringListImpl otherArrayList = new StringListImpl(10);

        otherArrayList.add(ONE);
        otherArrayList.add(TWO);

        assertTrue(stringArrayList.equals(otherArrayList));
    }

    @Test
    void validateItemNegativeTest() {
        assertThrows(NullItemException.class, () -> stringArrayList.add(null));
    }

    private void fillArray() {
        stringArrayList.add(ONE);
        stringArrayList.add(TWO);
        stringArrayList.add(THREE);
        stringArrayList.add(FOUR);
        stringArrayList.add(FIVE);
        stringArrayList.add(SIX);
        stringArrayList.add(SEVEN);
        stringArrayList.add(EIGHT);
        stringArrayList.add(NINE);
        stringArrayList.add(TEN);
    }
}