package org.study;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GetFirstGreaterArrayTest {

    @ParameterizedTest(name = "getRightFirstGreater")
    @MethodSource("candidateArray")
    void calculateArray(int[] originArray) {
        int[] firstGreaterArray = GetFirstGreaterArray.calculateFirstRightGreaterArray(originArray);
        assertNotNull(firstGreaterArray);
        assertEquals(11, firstGreaterArray[3]);
        assertEquals(-1, firstGreaterArray[4]);
    }

    static Stream<int[]> candidateArray() {
        return Stream.of(new int[]{2, 6, 7, 5, 11});
    }
}