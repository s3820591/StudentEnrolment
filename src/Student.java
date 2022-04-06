import java.util.ArrayList;
import java.util.Date;

public class Student {
    public String id;
    public String name;
    public Date birthday;

    public Student (String id, String name, Date birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    ArrayList<Student> students = new ArrayList<Student>();

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
