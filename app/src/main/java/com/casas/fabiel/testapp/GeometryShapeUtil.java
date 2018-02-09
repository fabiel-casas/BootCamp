package com.casas.fabiel.testapp;

public class GeometryShapeUtil {
    public final static int SQUARE = 0;
    public final static int TRIANGLE = 1;
    public final static int DIAMOND = 2;

    public static String createShape(int shape) {
        return createShape(shape, 3);
    }

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
        int maxSize = calculateMaxSize(size);
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < size; row++) {
            String asterisk = getAsteriskTriangle(row);
            String lateralSpace = getLateralSpace(maxSize, asterisk.length());
            result.append(lateralSpace).append(asterisk).append(lateralSpace).append("\n");
        }
        return result.toString();
    }

    private static String getAsteriskTriangle(int row) {
        int asteriskNum = calculateMaxSize(row + 1);
        StringBuilder asterisk = new StringBuilder();
        for (int count = 0; count < asteriskNum; count++) {
            asterisk.append("*");
        }
        return asterisk.toString();
    }

    private static String getLateralSpace(int maxSize, int asteriskLength) {
        int spaceCount = (maxSize - asteriskLength) / 2;
        StringBuilder space = new StringBuilder();
        for (int count = 0; count < spaceCount; count++) {
            space.append(" ");
        }
        return space.toString();
    }

    private static int calculateMaxSize(int size) {
        int sizeResult = 1;
        for (int iteration = 1; iteration < size; iteration++) {
            sizeResult += 2;
        }
        return sizeResult;
    }

    private static String createSquare(int size) {
        return new StringBuilder().append("***\n").
                append("***\n").
                append("***\n").toString();
    }
}
