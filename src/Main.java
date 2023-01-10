import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Lecture[] lectures = new Lecture[1];
        lectures[0] = new Lecture("BookOP", "AutorOP", true, "https:bookOP.com");
        String[] homework = {"Math Homework ,solve........","Read page120"};

        Teacher teacher = new Teacher("Math teacher", 11, "math",new Math());
        teacher.teach(teacher.getSubjects());
        teacher.homework(teacher.getSubjects(), homework);
        teacher.giveOptionalLecture(teacher.getSubjects(), lectures);


        Student student = new Student("a", 1, 1, true);
        student.showSubjects();
        System.out.println(student.subjects[0].getName());
        System.out.println(student.subjects[0].getTeacher());
        System.out.println(student.subjects[0].getDescription());
        System.out.println(student.subjects[0].getMandatoryLecture());
        System.out.println(Arrays.toString(student.subjects[0].getOptionalLecture()));
        System.out.println(Arrays.toString(student.subjects[0].getHomework()));


    }
}