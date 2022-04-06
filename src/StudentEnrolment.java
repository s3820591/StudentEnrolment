import java.util.ArrayList;
import java.util.Scanner;

public class StudentEnrolment implements StudentEnrolmentManager{
    Student student;
    Course course;
    String semester;

    public StudentEnrolment(Student student, Course course, String semester){
        this.student = student;
        this.course = course;
        this.semester = semester;
    }

    public StudentEnrolment(String id, String semester){
        this.student.id = id;
        this.semester = semester;
    }

    ArrayList<StudentEnrolment> enrolment = new ArrayList<>();

    public StudentEnrolment() {

    }

    @Override
    public String toString() {
        return "StudentEnrolment{" +
                "student=" + student +
                ", course=" + course +
                ", semester='" + semester + '\'' +
                '}';
    }

    public Student getStudent(String id){
        if (this.student.id == id){
            return student;
        }
        else{
            System.out.println("no student with this id");
        }
        return null;
    }

    public Course getCourse(String id){
        if (this.course.id == id){
            return course;
        }
        else{
            System.out.println("no course with this id");
        }
        return null;
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
        Scanner s = new Scanner(System.in);
        System.out.println("What do you want to do?");
        System.out.println("1. add enrollment");
        System.out.println("2. delete enrolment");
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
        ArrayList<Integer> a = new ArrayList<>();
        for (int j = 0; j <= enrolment.size(); j++ ){
            if ((enrolment.get(j).semester.equals(this.semester))&&enrolment.get(j).student.id.equals(this.student.id)){
                a.add(j);
            }
        }
        for (int j = 0; j < a.size(); j++){
            System.out.println(j+1 + ". " + enrolment.get(a.get(j)).course );
        }

    }

    @Override
    public void getAll() {
        for (int i = 0; i< enrolment.size(); i++){
            System.out.println(enrolment.get(i));
        }
    }
}

