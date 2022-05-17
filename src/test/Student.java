package test;

/**
 * @author Lenovo
 */
public class Student  {
    private String name;
    private int age;
    private String sid;
    private String address;
    private String math;
    private String chinese;

    public Student(String name, int age, String sid, String address, String math, String chinese) {
        this.name = name;
        this.age = age;
        this.sid = sid;
        this.address = address;
        this.math = math;
        this.chinese = chinese;
    }

    public String getMath() {
        return math;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sid='" + sid + '\'' +
                ", address='" + address + '\'' +
                ", math='" + math + '\'' +
                ", chinese='" + chinese + '\'' +
                '}';
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

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
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (sid != null ? sid.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
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


//    @Override
//    public int compareTo(Student o) {
//        //  return 0  认为后面的和这个对象相同 只添加一个
//        //  return 1  按照添加的顺序
//        //  return -1  按照添加的逆序
//        return this.age - o.age;
//    }
}
