package com.casas.fabiel.testapp;

public class GeometryShapeUtil {
    public final static int SQUARE = 0;
    public final static int TRIANGLE = 1;
    public final static int DIAMOND = 2;

    public static String createShape(int shape, int size) {
        switch (shape) {
            case SQUARE:
                return createSquare(size);
            case TRIANGLE:
                return createTriangle(size);
            case DIAMOND:
                return createDiamond(size);
            default:
                return createSquare(size);
        }

    }

    private static String createDiamond(int size) {
        return new StringBuilder().append(" * \n").
                                append(" ***  \n").
                                append("*****\n").
                                append(" *** \n").
                                append("  *  \n").toString();
    }

    private static String createTriangle(int size) {
        return new StringBuilder().append("  *  \n").
                                   append(" ***   \n").
                                   append("*****\n").toString();
    }

    private static String createSquare(int size) {
        return new StringBuilder().append("***\n").
                append("***\n").
                append("***\n").toString();
    }
}
