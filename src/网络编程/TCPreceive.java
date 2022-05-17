package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPreceive {
    public static void main(String[] args) throws IOException {
        ServerSocket r = new ServerSocket(10086);
        Socket rw = r.accept();
        BufferedReader reader = new BufferedReader(new InputStreamReader(rw.getInputStream()));
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        r.close();
    }
}
