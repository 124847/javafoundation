package 网络编程.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ur {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(10086);

        byte[] b = new byte[1024];
        DatagramPacket packet = new DatagramPacket(b, b.length);
        socket.receive(packet);
        System.out.println(new String(packet.getData(), 0, packet.getLength(),"utf-8"));


    }
}
