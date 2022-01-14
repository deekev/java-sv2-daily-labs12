package day05;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StringStatisticsTest {

    @Test
    void testGetNumberOfCharacters() {

        StringStatistics stringStatistics = new StringStatistics();

        Map<Character, Integer> result = stringStatistics.getNumberOfCharacters("vadalmafa");

        assertEquals(4, result.get('a'));
        assertEquals(1, result.get('f'));
    }

    @Test
    void testGetNumberOfCharactersWithInvalidString() {

        StringStatistics stringStatistics = new StringStatistics();

        assertThrows(IllegalArgumentException.class, () -> stringStatistics.getNumberOfCharacters(null));
        assertThrows(IllegalArgumentException.class, () -> stringStatistics.getNumberOfCharacters(""));
    }
}