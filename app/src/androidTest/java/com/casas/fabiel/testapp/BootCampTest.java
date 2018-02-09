package com.casas.fabiel.testapp;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class BootCampTest {

    @Test
    public void checkBootCampTest() {
        assertTrue(BootCampUtils.oddNumber(3));
        assertTrue(BootCampUtils.pairNumber(6));
        assertTrue(BootCampUtils.isMultipleNumber(6, 3));
        assertFalse(BootCampUtils.isMultipleNumber(6, 4));
    }

    @Test
    public void checkLeapYear() {
        assertFalse(BootCampUtils.isLeapYear(1));
        assertFalse(BootCampUtils.isLeapYear(1900));
        assertTrue(BootCampUtils.isLeapYear(2016));
        assertTrue(BootCampUtils.isLeapYear(2000));
    }

    @Test
    public void getMaxNumber() {
        assertEquals(BootCampUtils.maxNumber(10, 15, 1), 15);
        assertEquals(BootCampUtils.maxNumber(100, 15, 80), 100);
        assertEquals(BootCampUtils.maxNumber(89, 1, 90), 90);
    }

    @Test
    public void checkSequenceOne() {
        assertEquals(BootCampUtils.sequenceOne(2.0d), 1.5d, 0.05d);
        assertEquals(BootCampUtils.sequenceOne(3.0d), 1.8d, 0.05d);
        assertEquals(BootCampUtils.sequenceOne(4.0d), 2.1d, 0.05d);
    }

    @Test
    public void checkSequenceTwo() {
        assertEquals(BootCampUtils.sequenceTwo(3.0d), 2.5d, 0.05d);
        assertEquals(BootCampUtils.sequenceTwo(7.0d), 4.9d, 0.05d);
        assertEquals(BootCampUtils.sequenceTwo(10.0d), 6.0d, 0.05d);
    }

    @Test
    public void checkTriangle() {
        assertTrue(BootCampUtils.validTriangle(3, 3, 5));
        assertFalse(BootCampUtils.validTriangle(3, 3, 7));
    }


    @Test
    public void checkDancingText() {
        assertEquals(BootCampUtils.dancingText("En total serán protegidas 12.946 hectáreas"),
                "En Total Serán Protegidas 12.946 Hectáreas");
    }


}
