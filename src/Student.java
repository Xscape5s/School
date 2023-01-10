public class Student extends Person{

    private int year;
    private boolean tax;
    public Subjects[] subjects= new Subjects[10];
    public Subjects[] optionalSubjects= new Subjects[3];

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isTax() {
        return tax;
    }

    public void setTax(boolean tax) {
        this.tax = tax;
    }

    public Student(String name, int id, int year, boolean tax) {
        super(name, id);
        this.year = year;
        this.tax = tax;
        addSubjects(year);
        addOptionalSubjects();
    }

    public void addSubjects(int year){
        switch (year) {
            case 1 -> {
                subjects[0] = new Math();
                subjects[1] = new Algebra();
                subjects[2] = new Physics();
                subjects[3] = new English();
                subjects[4] = new ComputerScience();
                subjects[5] = new Electronics();
            }
            case 2 -> {
                subjects[0] = new Math();
                subjects[1] = new Physics();
                subjects[2] = new English();
                subjects[3] = new ComputerScience();
                subjects[4] = new Electronics();
            }
            case 3 -> {
                subjects[0] = new Math();
                subjects[1] = new English();
                subjects[2] = new ComputerScience();
                subjects[3] = new Electronics();
            }
            case 4 -> {
                subjects[0] = new Math();
                subjects[1] = new ComputerScience();
                subjects[2] = new Electronics();
            }
            default -> {
            }
        }

    }

public void addOptionalSubjects(){
        optionalSubjects[0]= new Pedagogy();
        optionalSubjects[1]= new AdvanceMath();
        optionalSubjects[2]=new AdvanceComputerScience();
}
public void showOptionalSubjects(){
        for(int i=0;i< optionalSubjects.length;i++){
            if(optionalSubjects[i]!=null)
            System.out.println(i+"."+optionalSubjects[i].getName());
        }
}

public void addOptionalToMandatorySubjects(int num){
        switch (num){
            case 1 -> {
                for(int i = 0; i<subjects.length; i++){
                    if(subjects[i]==null)
                    {
                        subjects[i]=optionalSubjects[0];
                        break;
                    }
                }
            }
            case 2 -> {
                for(int i = 0; i<subjects.length; i++){
                    if(subjects[i]==null)
                    {
                        subjects[i]=optionalSubjects[1];
                        break;
                    }
                }
            }
            case 3 -> {
                for(int i = 0; i<subjects.length; i++){
                    if(subjects[i]==null)
                    {
                        subjects[i]=optionalSubjects[2];
                        break;
                    }
                }
            }
            default -> {}
        }

}

public void showSubjects(){
        for(int i=0;i<subjects.length;i++)
            if(subjects[i]!=null)
            System.out.println(subjects[i].getName());
}


}
