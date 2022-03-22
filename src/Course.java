import java.util.ArrayList;

public class Course implements StudentEnrolmentManager {
    String id;
    String name;
    int credits;

    public Course(String id, String name, int credits) {
        this.id = id;
        this.name = name;
        this.credits = credits;
    }

    ArrayList<Course> courses = new ArrayList<Course>();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
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
