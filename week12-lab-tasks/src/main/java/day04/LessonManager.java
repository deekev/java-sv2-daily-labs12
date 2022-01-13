package day04;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LessonManager {

    private List<Lesson> lessons = new ArrayList<>();

    public List<Lesson> getLessons() {
        return new ArrayList<>(lessons);
    }

    public int getNumberOfLessonsByTeacher(String name) {
        int sum = 0;
        for (Lesson actual: lessons) {
            if (name.equals(actual.getTeacherName())) {
                sum += actual.getNumberOfLesson();
            }
        }
        return sum;
    }

    public void fillLessons(Path path) {
        try (Scanner sc = new Scanner(path)){
            while (sc.hasNextLine()) {
               Lesson result = createLesson(sc);
               lessons.add(result);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not reach file.", ioe);
        }
    }

    private Lesson createLesson(Scanner scanner) {
        String teacher = scanner.nextLine();
        String subject = scanner.nextLine();
        String schoolClass = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        return new Lesson(teacher, subject, schoolClass, number);
    }
}
