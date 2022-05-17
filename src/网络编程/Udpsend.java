package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class Udpsend {
    public static void main(String[] args) throws IOException {

        DatagramSocket socket = new DatagramSocket();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {

                DatagramPacket packet = new DatagramPacket(line.getBytes(StandardCharsets.UTF_8),line.getBytes().length, InetAddress.getByName("10.102.189.126"), 10086);
                socket.send(packet);

                if (line.equals("886")) {
                    socket.close();
                    break;
                }
        }

    }
}
