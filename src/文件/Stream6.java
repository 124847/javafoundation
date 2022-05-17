package 文件;

import java.io.*;

public class Stream6 {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        method();
        long l1 = System.currentTimeMillis();

        System.out.println(l1 - l);
    }

    public static void method() throws IOException {
        BufferedInputStream ff = new BufferedInputStream(new FileInputStream("D:\\录屏\\1.mp4"));
        BufferedOutputStream ww = new BufferedOutputStream(new FileOutputStream("myfile\\2.mp4"));
        byte[] bq = new byte[1024];
        int len;
        while ((len = ff.read(bq)) != -1) {
            ww.write(bq, 0, len);
        }
        ff.close();
        ww.close();
    }
}
