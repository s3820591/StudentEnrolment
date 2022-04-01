import java.util.ArrayList;

public class StudentEnrolment implements StudentEnrolmentManager{
    Student student;
    Course course;
    String semester;

    public StudentEnrolment(Student student, Course course, String semester){
        this.student = student;
        this.course = course;
        this.semester = semester;
    }

    public StudentEnrolment(String semester){
        this.semester = semester;
    }

    ArrayList<StudentEnrolment> enrolment = new ArrayList<>();

    @Override
    public String toString() {
        return "StudentEnrolment{" +
                "student=" + student +
                ", course=" + course +
                ", semester='" + semester + '\'' +
                '}';
    }

    @Override
    public void add() {
        try {
            enrolment.add(this);
        }catch (Exception e){
            System.out.println("Wrong format of something");
        }
    }

    @Override
    public void update() {
        ArrayList<Integer> a = new ArrayList<>();
        for (int j = 0; j <= enrolment.size(); j++ ){
            if (enrolment.get(j).semester.equals(this.semester)){
                a.add(j);
            }
        }
        for (int j = 0; j < a.size(); j++){
            System.out.println(j+1 + ". " + enrolment.get(a.get(j)) );
        }

    }

    @Override
    public void delete() {
        try {
            enrolment.remove(this);
        }catch (Exception e){
            System.out.println("Wrong format of something");
        }
    }

    @Override
    public void getOne() {

    }

    @Override
    public void getAll() {

    }
}

