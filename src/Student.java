import java.util.ArrayList;
import java.util.Date;

public class Student implements StudentEnrolmentManager {
    public String id;
    public String name;
    public Date birthday;

    public Student (String id, String name, Date birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    ArrayList<Student> students = new ArrayList<Student>();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public void add() {
        students.add(this);
    }

    @Override
    public void update() {
        if (students.indexOf(this.id) != -1){
            System.out.println("There is no student with this id!");
        }
    }

    @Override
    public void delete() {
        students.remove(students.indexOf(this.id));
    }

    @Override
    public void getOne() {

    }

    @Override
    public void getAll() {

    }
}
