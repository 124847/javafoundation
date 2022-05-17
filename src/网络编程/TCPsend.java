package 网络编程;

import java.io.*;
import java.net.Socket;

public class TCPsend {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.3.34", 10086);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        BufferedReader w = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = w.readLine()) != null) {
            writer.write(line);
            writer.newLine();
            writer.flush();
            if (line.equals("886")) {
                s.close();
                break;
            }
        }
    }
}
