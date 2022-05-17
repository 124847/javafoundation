package 文件;

import java.io.*;

public class Reader0 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ww = new InputStreamReader(new FileInputStream("src/dayone/字符串.java"));
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("myfile\\ja.txt"));
        char[] ch = new char[1024];
        int len;
        while ((len = ww.read(ch)) != -1) {
            writer.write(ch, 0,len);
        }

        ww.close();
        writer.close();
    }
}
