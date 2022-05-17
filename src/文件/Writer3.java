package 文件;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Writer3 {

    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("myfile\\java.txt\\java.txt"));
        char[] ch = new char[1024];
        int len;
        while ((len = reader.read(ch)) != -1) {
            System.out.print(new String(ch, 0, len));
        }
        reader.close();
    }

}
