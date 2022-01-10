package day01;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class RunningFileManagerTest {

    @Test
    void testGetKmsPerMonth() {

        RunningFileManager runningFileManager = new RunningFileManager();

        Path path = Path.of("src/test/resources/running.csv");
        runningFileManager.readLines(path);

        double result = runningFileManager.getKmsPerMonth(2021, Month.DECEMBER);

        assertEquals(41.2, result);
    }
}