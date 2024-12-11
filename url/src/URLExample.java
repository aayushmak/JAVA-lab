import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLExample {
    public static void main(String[] args) {
        try {
            // Create a URL object
            URL url = new URL("https://www.aayushmak.com.np/");

            // Open a connection to the URL
            URLConnection connection = url.openConnection();

            // Connect to the URL resource
            connection.connect();



            // Create a BufferedReader to read from the URL's InputStream
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String inputLine;
            System.out.println("\nContents of the webpage:");

            // Read and display the content from the webpage line by line
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }

            // Close the reader
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
