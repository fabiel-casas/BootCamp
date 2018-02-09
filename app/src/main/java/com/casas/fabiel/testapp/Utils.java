package com.casas.fabiel.testapp;

import java.util.HashMap;
import java.util.Map;


public class Utils {
    private static int sizeNum = 0;

    public static int[] counts(int[] nums, int[] maxes) {
        int[] results = new int[maxes.length];
        Map<Integer, Integer> res = new HashMap<>();
        for (int i = 0; i < maxes.length; i++) {
            sizeNum = 0;
            if (res.containsKey(maxes[i])) {
                results[i] = res.get(maxes[i]);
            } else {
                res.put(maxes[i], internalCount(maxes[i], nums));
                results[i] = res.get(maxes[i]);
            }
        }
        return results;
    }

    public static int internalCount(int max, int[] nums) {
        int maxSum = (nums[sizeNum] <= max) ? 1 : 0;
        sizeNum++;
        if (sizeNum < nums.length) {
            return internalCount(max, nums) + maxSum;
        }
        return maxSum;
    }

    public static int[] getMinimumDifference(String[] a, String[] b) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = getDifferenceWeight(a[i], b[i]);
        }
        return result;
    }

    public static int getDifferenceWeight(String a, String b) {
        if (a.length() != b.length()) {
            return -1;
        }
        if (valueOfString(a) == valueOfString(b)) {
            return 0;
        }
        return getWeightOfNoAnagram(a, b);
    }

    private static int getWeightOfNoAnagram(String a, String b) {
        String auxB = b;
        for (int j = 0; j < a.length(); j++) {
            auxB = auxB.replaceFirst(String.valueOf(a.charAt(j)), "");
        }
        return auxB.length();
    }

    private static int valueOfString(String text) {
        int value = 0;
        for (int j = 0; j < text.length(); j++) {
            value += text.charAt(j);
        }
        return value;
    }
}
