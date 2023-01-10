public  class Subjects {

    private String name;
    private String description;
    private  Lecture mandatoryLecture;
    private Lecture[] optionalLecture;

    private String[] homework;

    private String teacher;

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


}
