package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class s {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(44331);

            String message = "Hello";

            DatagramPacket dp = new DatagramPacket(message.getBytes(),message.length(),InetAddress.getLocalHost(), 44332);
            ds.send(dp);

            ds.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
