package 文件;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("myfile\\ja.txt");
        /*三件事情
        调用系统功能创建了文件
        创建了字节输出流对象
        让字节输出流对象指向创建好的文件
        **/
        fos.write(97);
        //释放资源  关闭此文件输出流并释放与此流相关联的任何系统资源
        fos.close();

    }
}
