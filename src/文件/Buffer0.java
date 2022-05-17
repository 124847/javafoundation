package 文件;

import java.io.*;

public class Buffer0 {
    public static void main(String[] args)throws IOException {
//        FileOutputStream ff = new FileOutputStream("myfile/ja.txt");
//        BufferedOutputStream stream = new BufferedOutputStream(ff);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myfile/ja.txt"));
        bos.write("hello\r\nworld".getBytes());
        bos.write("ni".getBytes());
        bos.close();

        BufferedInputStream bb = new BufferedInputStream(new FileInputStream("myfile/ja.txt"));
//        int by;
//        while((by = bb.read()) != -1) {
//            System.out.print((char)by);
//        }
        byte[] vv = new byte[1024];
        int len;
        while ((len = bb.read(vv)) != -1) {
            System.out.print(new String(vv,0,len));
        }
    }
}
