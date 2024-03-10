package InetAddress;

import java.net.InetAddress;

public class Inet_01 {
    public static void main(String[] args) {
        try {
            InetAddress a = InetAddress.getByName("www.google.com");
            System.out.println(a.getHostAddress());
            System.out.println(a.getHostAddress());
            System.out.println(a.isLoopbackAddress());
            System.out.println(a.isMulticastAddress());
            System.out.println(a.isAnyLocalAddress());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

// Output:
// 142.250.182.196
// 142.250.182.196
// false
// false
// false