package 网络编程.test;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ts {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(1024);
        while (true) {
            Socket accept = socket.accept();
            new Thread(new ServerThread (accept)).start();
        }
    }
}
