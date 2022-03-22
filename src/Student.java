import java.util.ArrayList;
import java.util.Date;

public class Student implements StudentEnrolmentManager {
    private String id;
    public String name;
    private Date birthday;

    public Student (String id, String name, Date birthday) {
        id = this.id;
        name = this.name;
        birthday = this.birthday;
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

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

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
