package 文件;

import java.io.FileInputStream;
import java.io.IOException;

public class Stream3 {
    public static void main(String[] args) throws IOException {
        FileInputStream ff = new FileInputStream("myfile\\ja.txt");
        int i;
        while ((i = ff.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
