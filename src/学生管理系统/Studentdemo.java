package 学生管理系统;

import 学生管理系统.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Studentdemo {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();
        while (true) {
            System.out.println("——————————欢迎来到学生管理系统————————————");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 结束");
            System.out.println("请输入你的选择");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    System.out.println("添加学生");
                    addStudent(arr);
                    break;
                case "2":
                    System.out.println("删除学生");
                    removeStudent(arr);
                    break;
                case "3":
                    System.out.println("修改学生");
                    changeStudent(arr);
                    break;
                case "4":
                    System.out.println("查看所有学生");
                    show(arr);
                    break;
                case "5":
                    System.out.println("结束程序,谢谢使用!");
                    System.exit(0);

            }
        }
    }
    public static boolean isusedsid(ArrayList<Student> arr, String sid) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getSid().equals(sid)) {
                return true;
            }
        }
        return false;
    }
    public static void addStudent(ArrayList<Student> arr) {
        System.out.println("姓名");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String sid;
        while (true) {
            System.out.println("学号");
            sid = sc.nextLine();
            if (isusedsid(arr, sid)) {
                System.out.println("存在该学生学号,请重新输入");
            }else{
                break;
            }
        }
        System.out.println("地址");
        String address = sc.nextLine();
        System.out.println("年龄");
        int age = sc.nextInt();
        arr.add(new Student(name, age, sid, address));
        System.out.println("添加成功");
        show(arr);
    }
    public static void changeStudent(ArrayList<Student> arr) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while (true) {
            System.out.println("请输入学生的学号");
            sid = sc.nextLine();
            if (!isusedsid(arr, sid)) {
                System.out.println("不存在该学生学号,请重新输入");
            }else{
                break;
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getSid().equals(sid)) {
                System.out.println("姓名");
                String name = sc.nextLine();
                System.out.println("地址");
                String address = sc.nextLine();
                System.out.println("年龄");
                int age = sc.nextInt();
                arr.set(i, new Student(name, age, sid, address));
            }
        }
        show(arr);
    }
    public static void removeStudent(ArrayList<Student> arr) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while (true) {
            System.out.println("请输入学生的学号");
            sid = sc.nextLine();
            if (!isusedsid(arr, sid)) {
                System.out.println("不存在该学生学号,请重新输入");
            }else{
                break;
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getSid().equals(sid)) {
                arr.remove(i);
            }
        }
        show(arr);
    }
    public static void show(ArrayList<Student> arr) {
        if (arr.size() == 0) {
            System.out.println("空");
            return;
        }
        System.out.println("——————————学生信息——————————");
        System.out.println("姓名\t\t年龄\t\t地址\t\t学号");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).getName()+"\t\t"+ arr.get(i).getAge()+"岁\t" + arr.get(i).getAddress()+"\t\t" + arr.get(i).getSid());
        }
    }
}
