package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class reciver {
    public static void main(String[] args) {
        try{
        DatagramSocket ds = new DatagramSocket(55556);

        byte[] buff = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buff, buff.length);
        ds.receive(dp);

        String str = new String(dp.getData(), 0, dp.getLength());
        System.out.println(str);
        ds.close();
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
}
