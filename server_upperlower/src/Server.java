import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server started. Waiting for client connection...");

            while (true) {
                // Accept a connection from a client
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected.");

                // Create input and output streams
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                // Read input from client
                String clientMessage = in.readLine();
                System.out.println("Received from client: " + clientMessage);
                // Process the message (convert to uppercase)
                String response = clientMessage.toUpperCase();

                // Send the response back to the client
                out.println(response);
                System.out.println("Sent to client: " + response);

                // Close the client connection
                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
