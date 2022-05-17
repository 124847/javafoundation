package 文件;

import java.io.File;

public class FileAll {
    public static void main(String[] args) {
        f(new File("D:\\itawnihao"));
    }

    public static void f(File n) {

        if (n.list() == null) {
            return;
        }
        File[] files = n.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                f(file);
        }else{
                System.out.println(file.getAbsoluteFile());
            }
        }

    }
}
