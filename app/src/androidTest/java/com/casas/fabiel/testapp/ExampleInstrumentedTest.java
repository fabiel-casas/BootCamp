package com.casas.fabiel.testapp;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
//        assertEquals("com.casas.fabiel.testapp", appContext.getPackageName());
        int[] nums = new int[]{
                5,2,10,8,4
        };
        int[] maxes = new int[]{
                3,1,7,8
        };
        int[] resultN = new int[]{
                1,0,3,4
        };
        assertArrayEquals(resultN, Utils.counts(nums, maxes));
        /*String[] a = new String[]{"hhpddlnnsjfoyxpci", "xulkowreuowzxgnhmiqekxhz", "dnqaurlp", "aujteqimwfkjoqodgqaxbrkrwykpmuimqtgulojjwtukjiqra", "lbafwuoawkxydlfcbjjtxpzpchzrvbtiev"};
        String[] b = new String[]{"ioigvjqzfbpllssuj", "istdocbnyozmnqthhpievvlj", "lofnrtmh", "sqejbvfbixnchzsahpnyayutsgecwvcqngzoehrmeeqlgknnb", "qbpedlqbktorypcjkzzkodrpvosqzxmpad"};
        int[] result = new int[]{10,13,5,26,15};
        assertArrayEquals(result, Utils.getMinimumDifference(a, b));*/

    }


}
