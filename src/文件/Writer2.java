package 文件;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer2 {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("myfile\\ja.txt");
        FileReader reader = new FileReader("myfile\\java.txt\\java.txt");

//        char[] ch = new char[1024];
//        int len;
//        while ((len = reader.read(ch)) != -1) {
//            writer.write(ch, 0, len);
//        }
        int ch;
        while ((ch = reader.read()) != -1) {
            writer.write(ch);
        }
        writer.close();
        reader.close();
    }
}
