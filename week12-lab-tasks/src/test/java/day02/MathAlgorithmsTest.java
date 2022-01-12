package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    void testFindGreatestCommonDivisor() {

        MathAlgorithms mathAlgorithms = new MathAlgorithms();

        assertEquals(9, mathAlgorithms.findGreatestCommonDivisor(27, 9));
        assertEquals(1, mathAlgorithms.findGreatestCommonDivisor(15, 11));
    }

    @Test
    void testFindWithEuclideanAlgorithm() {

        MathAlgorithms mathAlgorithms = new MathAlgorithms();

        assertEquals(9, mathAlgorithms.findWithEuclideanAlgorithm(27,9));
        assertEquals(1, mathAlgorithms.findWithEuclideanAlgorithm(15,11));
    }
}