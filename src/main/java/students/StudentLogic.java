package students;
public class StudentLogic {
    String name;
    char grade;
    float gpa;

    StudentLogic(String name,char grade,float gpa){
        this.name=name;
        this.grade=grade;
        this.gpa=gpa;
    }

    protected void update(float newgpa){
        gpa=newgpa;
    }

    protected String profile(){
        return name +" has a "+gpa +" GPA";
    }
}
