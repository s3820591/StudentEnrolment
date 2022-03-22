import java.util.ArrayList;

public class StudentEnrolment implements StudentEnrolmentManager{
    Student student;
    Course course;
    String semester;

    public StudentEnrolment(Student student, Course course, String semester){
        student = this.student;
        course = this.course;
        semester = this.semester;
    }

    ArrayList<StudentEnrolment> enrolment = new ArrayList<StudentEnrolment>();
    @Override
    public void add() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void getOne() {

    }

    @Override
    public void getAll() {

    }
}

