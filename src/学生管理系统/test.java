package 学生管理系统;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        write();
        read();
        }

    public static void read() throws IOException,ClassNotFoundException {
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream("1.txt"));
        Object o = null;

        while ((o = stream.readObject()) != null) {
            System.out.println((Student)o);
    }
        stream.close();
    }
    public static void write() throws IOException,ClassNotFoundException{
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("1.txt"));
        outputStream.writeObject(new Student("haha", 20));
        outputStream.writeObject(new Student("haha", 20));
        outputStream.writeObject(new Student("haha", 20));
        outputStream.writeObject(null);
        outputStream.close();
    }
}
