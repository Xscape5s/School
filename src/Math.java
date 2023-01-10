public class Math extends Subjects{

   static private final String name = "Math";
   static private final String description = "1.Introduction in " + name + "\n" +
            "2.Understanding " + name + "\n" +
            "3.Exam";
   static private final Lecture mandatoryLecture;
    private static Lecture[] optionalLecture;

    private static String[] homework;

    private static String teacher;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Lecture getMandatoryLecture() {
        return mandatoryLecture;
    }

    public Lecture[] getOptionalLecture() {
        return optionalLecture;
    }

    public void setOptionalLecture(Lecture[] optionalLecture) {
        this.optionalLecture = optionalLecture;
    }

    public String[] getHomework() {
        return homework;
    }

    public void setHomework(String[] homework) {
        this.homework = homework;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    static {mandatoryLecture= new Lecture(name+" book","Author",true,"https://"+name+"book.com");}


}
