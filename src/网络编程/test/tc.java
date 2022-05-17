package 网络编程.test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class tc {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("10.102.189.126", 1024);
        OutputStream stream = socket.getOutputStream();
        stream.write("123".getBytes());
        stream.close();
        socket.close();
    }
}
