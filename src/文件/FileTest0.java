package 文件;

import java.io.File;

/*File(String pathname)  通过给定的路径名字符串转换为抽象路径名来创建新的File实例
File(String parent,String child)  从父类路径名字符串和子路径名字符串创建新的File实例
File(File parent, String child)  从父抽象路径名和子路径名字符串创建新的File实例*/
//
public class FileTest0 {
    public static void main(String[] args) {
        File f1 = new File("E:\\i\\java.test");
        File f2 = new File("E:\\i\\java.test","sad");
        File f3 = new File(f2,"sdaasd");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        File root = new File("D:/备份");
        Getallfiles(root);
    }

    public static void Getallfiles(File file) {
        File[] files = file.listFiles();
        if(files!=null){
            for (File file1 : files) {
                if (file1.isDirectory()) {
                    Getallfiles(file1);
                }else {
                    System.out.println(file1.getAbsoluteFile());
                }
            }
        }
    }

}
