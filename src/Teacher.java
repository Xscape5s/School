public class Teacher extends Person{

    private String subject;

    public String getSubject() {
        return subject;
    }

   private Subjects subjects;

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, int id, String subject,Subjects subjects) {
        super(name, id);
        this.subject = subject;
        this.subjects=subjects;
    }


public void giveOptionalLecture(Subjects subjects,Lecture[] optional){
       subjects.setOptionalLecture(optional);
}

    public void teach(Subjects subjects){
        subjects.setTeacher(getName());
    }

    public void homework(Subjects subjects,String[] homework){
        subjects.setHomework(homework);
    }

}
