package 文件;

import test.增强for;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
/*public  boolean isDirectory(){}  测试此抽象路径名表示的File是否为目录
public boolean isFile(){}     测试此抽象路径名表示的file是否为文件
public boolean exists(){}     测试此抽象路径名表示的file是否存在
public String getAbsolutePath(){}   返回此抽象路径的绝对路径名字符串
public String getPath(){}     将此抽象路径名转换为路径名字符串
public String getName(){}     返回由此抽象路径名表示的文件或目录的名称
public String[] list() {}       返回此抽象路径名表示的目录文件中的文件和目录的名称字符串数组
public File[] listFiles(){}    返回此抽象路径名表示的目录文件和目录的File对象数组*/
//

public class FileTest2 {

    public static void main(String[] args) {
        File f = new File("myfile\\java.txt");
        File f2 = new File(f, "java.txt");
        System.out.println(f.delete());
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.exists());
        System.out.println(f2.getAbsoluteFile());
        System.out.println(f2.getPath());
        System.out.println(f2.getName());
        File file = new File("D:\\itawnihao");
        if (!file.exists()) {
            System.out.println(file.mkdirs());
        }
        File file1 = new File(file, "java.txt");
        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String[] list = file.list();
        System.out.println(list.length);
        File[] files = file.listFiles();
        for (File file2 : files) {
            if (file2.isFile()) {
                System.out.println(file2.getName());
            }
        }
    }
}
