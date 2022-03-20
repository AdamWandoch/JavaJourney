package com.codingbat;

import static org.junit.Assert.*;
import static com.codingbat.Array3.seriesUp;

/**
 * @author Adam Wandoch
 */

public class Array3Test {

    @org.junit.Test
    public void seriesUpTest() {
        int[] result = new int[] {1,1,2,1,2,3};
        assertArrayEquals(result, seriesUp(3));
//        int[] result2 = new int[] {1,1,2,1,2,3,1,2,3,4};
//        assertArrayEquals(result2, seriesUp(4));
    }
}