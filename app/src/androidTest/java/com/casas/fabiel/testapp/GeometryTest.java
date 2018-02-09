package com.casas.fabiel.testapp;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static com.casas.fabiel.testapp.GeometryShapeUtil.DIAMOND;
import static com.casas.fabiel.testapp.GeometryShapeUtil.SQUARE;
import static com.casas.fabiel.testapp.GeometryShapeUtil.TRIANGLE;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class GeometryTest {

    @Test
    public void createASquare() {
        String shape = GeometryShapeUtil.createShape(SQUARE, 3);
        assertEquals(shape, new StringBuilder().append("***\n").
                append("***\n").
                append("***\n").toString());
    }

    @Test
    public void createATriangle() {
        String shape = GeometryShapeUtil.createShape(TRIANGLE, 4);
        assertEquals(shape, new StringBuilder().append("   *   \n").
                append("  ***  \n").
                append(" ***** \n").
                append("*******\n").toString());
    }

    @Test
    public void createADiamond() {
        String shape = GeometryShapeUtil.createShape(DIAMOND, 5);
        assertEquals(shape, new StringBuilder().append(" * \n").
                append(" ***  \n").
                append("*****\n").
                append(" *** \n").
                append("  *  \n").toString());
    }
}
