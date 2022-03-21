import java.util.Date;

public class Student {
    private String id;
    public String name;
    private Date birthday;

    public void Student (String id, String name, Date birthday) {
        id = this.id;
        name = this.name;
        birthday = this.birthday;
    }

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
}
