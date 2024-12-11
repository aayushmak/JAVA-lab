import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            Socket clientSocket = serverSocket.accept();
            InputStream inputStream = clientSocket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            String messageFromClient = (String) dataInputStream.readUTF();
            System.out.println("Message from server"+  messageFromClient);
            clientSocket.close();
            serverSocket.close();
        } catch (Exception e) {
        }
    }
}
