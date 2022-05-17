package 文件;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream4 {
    public static void main(String[] args) throws IOException {
        FileInputStream wr = new FileInputStream("myfile\\ja.txt");

        FileOutputStream rr = new FileOutputStream("myfile\\java.txt\\java.txt",true);

        int n;

        while ((n = wr.read()) != -1) {
            rr.write(n);
            System.out.print((char)n);
        }
        wr.close();

        wr = new FileInputStream("myfile\\ja.txt");

        byte[] bys = new byte[1024];
        int len;
        while ((len = wr.read(bys)) != -1) {
            System.out.print(new String(bys,0,len));
        }

        wr.close();
        rr.close();
    }
}
