import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args)
    {

        try {
            Socket socket = new Socket("localhost", 1234);
            OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("Hello");
            dataOutputStream.flush();
            dataOutputStream.close();
            socket.close();
        }catch (Exception e){

        }
    }
}
