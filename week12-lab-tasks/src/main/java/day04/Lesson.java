package day04;

public class Lesson {

    private String teacherName;
    private String subject;
    private String schoolClass;
    private int numberOfLesson;

    public Lesson(String teacherName, String subject, String schoolClass, int numberOfLesson) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.schoolClass = schoolClass;
        this.numberOfLesson = numberOfLesson;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public String getSchoolClass() {
        return schoolClass;
    }

    public int getNumberOfLesson() {
        return numberOfLesson;
    }
}
