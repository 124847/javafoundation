package 文件;

import java.io.File;
import java.io.IOException;

/*File类的创建功能
public boolean createNewFile()   当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
public boolean mkdir()   创建由此对抽象路径名命名的目录
public boolean mkdirs()  创建由此抽象路径名命名的目录,包括任何必需但不存在的父目录
*/
//
public class FileTest1 {
    public static void main(String[] args) {
        File file = new File("D:\\lianxila\\java");
        System.out.println(file.mkdirs());
        file.mkdirs();
        File file1 = new File("D:\\lianxila\\java", "java.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
