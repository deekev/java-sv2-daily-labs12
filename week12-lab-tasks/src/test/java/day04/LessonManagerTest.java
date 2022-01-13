package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class LessonManagerTest {

    @Test
    void testGetNumberOfLessonsByTeacher() {

        LessonManager lessonManager = new LessonManager();

        Path path = Paths.get("src/test/resources/beosztas.txt");
        lessonManager.fillLessons(path);

        int result = lessonManager.getNumberOfLessonsByTeacher("Albatrosz Aladin");

        assertEquals(24, result);
    }
}