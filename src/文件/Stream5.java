package 文件;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream5 {
    public static void main(String[] args) throws IOException {
        FileInputStream ff = new FileInputStream("C:\\Users\\Lenovo\\Pictures\\Saved Pictures\\2.jpg");
        FileOutputStream ww = new FileOutputStream("myfile\\1.jpg");
        byte[] ss = new byte[1024];
        int len;
        while ((len = ff.read(ss)) != -1) {
            ww.write(ss,0,len);
        }
        ff.close();
        ww.close();
    }
}
