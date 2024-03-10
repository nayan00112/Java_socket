package tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class c {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 54321);
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            out.println("Hello, I am Nayankumar.");

            BufferedReader bf = new BufferedReader(new InputStreamReader(s.getInputStream()));
            System.out.println("Ack: " + bf.readLine());

            bf.close();
            out.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
