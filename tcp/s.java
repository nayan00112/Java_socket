package tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class s {
    public static void main(String[] args) {
        try {
            ServerSocket sc = new ServerSocket(54321);
            System.out.println("Waiting for client ...");
            Socket s = sc.accept();

            BufferedReader bf = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String message = bf.readLine();
            System.out.println("Recived message: " + message);

            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            out.println("Recived at server: " + message);

            out.close();
            bf.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
