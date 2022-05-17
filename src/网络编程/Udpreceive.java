package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Udpreceive {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(10086);
        while (true) {
            byte[] bytes = new byte[1024];
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
            socket.receive(packet);
            String d = new String(packet.getData(), 0,packet.getLength());
            System.out.println(d);

        }

    }
}
