package edu.javacourse.net;

import java.io.*;
import java.net.Socket;
import java.time.LocalDateTime;

public class Client {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 1000; i++) {
            SimpleClient sc = new SimpleClient();
            sc.start();
        }

    }

    private static void sendRequest() throws IOException {
        Socket socket = new Socket("127.0.0.1", 25225);

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String sb = "Anton";

        bw.write(sb);
        bw.newLine();
        bw.flush();

        String answer = br.readLine();
        System.out.println(answer);
        System.out.println("client got answer:" + answer);

        br.close();
        bw.close();
    }
}

class SimpleClient extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Started:" + LocalDateTime.now());
            Socket socket = new Socket("127.0.0.1", 25225);

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            String sb = "Anton";

            bw.write(sb);
            bw.newLine();
            bw.flush();

            String answer = br.readLine();
            System.out.println("client got answer:" + answer);

            br.close();
            bw.close();
            System.out.println("Finished:" + LocalDateTime.now());
        }catch (IOException ex){
            ex.printStackTrace(System.out);
        }
    }
}
