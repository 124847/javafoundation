package 文件;

import java.io.FileOutputStream;
import java.io.IOException;

public class Stream2 {
    public static void main(String[] args)  {

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("myfile\\ja.txt",true);

        /*三件事情
        调用系统功能创建了文件
        创建了字节输出流对象
        让字节输出流对象指向创建好的文件
        **/
        fos.write(97);
        String x = "abcde";
        byte[] a = x.getBytes();
        fos.write(a, 1, x.length()-1);
        String next = "\n";
        fos.write(next.getBytes());
        //释放资源  关闭此文件输出流并释放与此流相关联的任何系统资源

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fos!=null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
