package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class r {
    public static void main(String[] args) {
        try{
        DatagramSocket ds = new DatagramSocket(44332);
        
        byte b[] = new byte[1024];

        DatagramPacket dp = new DatagramPacket(b, b.length);
        ds.receive(dp);

        String message = new String(dp.getData(), 0, dp.getLength());
        System.out.println(message);

        ds.close();
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
}
