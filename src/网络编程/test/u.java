package 网络编程.test;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class u {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String s = "你好";
        socket.send(new DatagramPacket("123".getBytes(StandardCharsets.UTF_8), "123".length(), InetAddress.getByName("10.102.189.126"), 10086));
        socket.close();
    }
}
