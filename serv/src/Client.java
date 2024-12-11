import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        final String HOST = "localhost";
        final int PORT = 1234;

        try (Socket socket = new Socket(HOST, PORT);
             BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader serverResponseReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            System.out.println("Connected to the server.");

            // Read a string from the user
            System.out.print("Enter a string: ");
            String userString = userInputReader.readLine();

            // Send the string to the server
            out.println(userString);

            // Read the upper case string from the server
            String response = serverResponseReader.readLine();
            System.out.println("Response from server: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.getMessage());
        }
    }
}
