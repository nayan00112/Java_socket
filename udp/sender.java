package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class sender {
    public static void main(String[] args) {

        try {
            DatagramSocket ds = new DatagramSocket(55555);

            InetAddress ip = InetAddress.getLocalHost();
            String message = "Nayan";

            DatagramPacket dp = new DatagramPacket(message.getBytes(), message.length(), ip, 55556);
            ds.send(dp);

            ds.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
