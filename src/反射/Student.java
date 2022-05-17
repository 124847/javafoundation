package 反射;

/**
 * @author Lenovo
 */
public class Student {
    private String name;
    private int age;
    private String sid;
    private String address;

    public Student() {

    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(String sid, String address) {
        this.sid = sid;
        this.address = address;
    }
    public Student(String name, int age, String sid, String address) {
        this(name, age);
        this.sid = sid;
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setSid(String sid) {
        this.sid = sid;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public String getSid() {
        return sid;
    }
    public String getAddress() {
        return address;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sid='" + sid + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Student student = (Student) o;

        if (age != student.age) {
            return false;
        }
        if (name != null ? !name.equals(student.name) : student.name != null) {
            return false;
        }
        if (sid != null ? !sid.equals(student.sid) : student.sid != null) {
            return false;
        }
        return address != null ? address.equals(student.address) : student.address == null;
    }

}
