import java.io.*;
import java.net.*;

public class MyServer {
	public static void main(String[] args) throws Exception {

		// Creating welcomeSocket
		int port = 6666;
		ServerSocket welcomeSocket = new ServerSocket(port);
		System.out.println("Server is running on port " + port);

		// Creating connectionSocket
		Socket connectionSocket = welcomeSocket.accept();
		System.out.println("Client connected");

		// Accepting input from Client
		BufferedReader inpFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));

		// Sending output to client
		PrintWriter outToClient = new PrintWriter(connectionSocket.getOutputStream(), true);

		while (true) {
			String clientData = inpFromClient.readLine(); // Accepting input from client
			System.out.println("Client Message: " + clientData);
			if (clientData.equals("exit")) {
				break;
			}
			clientData = clientData.toUpperCase(); // Converting the input to upper case
			outToClient.println(clientData); // Sending the modified data to client
		}

		// Closing the connections
		connectionSocket.close();
		welcomeSocket.close();
	}
}
