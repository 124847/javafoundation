package test;

public class Teacher {
    public void CheckScore(int score)throws EX自定义异常 {
        if (score > 100 || score < 0) {
            throw new EX自定义异常("分数越界");
        }else {
            System.out.println("分数正常");
        }
    }

    int age;
    String Name;

    public Teacher() {
    }

    public Teacher(int age, String name) {
        this.age = age;
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
