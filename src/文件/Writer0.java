package 文件;

import java.io.*;

public class Writer0 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("myfile\\ja.txt"));
        InputStreamReader ww = new InputStreamReader(new FileInputStream("myfile\\ja.txt"));
        char[] chs = {'q', 's', 's'};
        writer.write("asdsadasda");
        writer.close();

        int len;
        while ((len = ww.read()) != -1) {
            System.out.println((char) len);
        }
        ww.close();
    }
}
