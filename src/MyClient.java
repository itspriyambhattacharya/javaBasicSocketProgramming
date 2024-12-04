import java.io.*;
import java.net.*;

public class MyClient {
	public static void main(String[] args) throws Exception {

		// Creating client Socket
		String host = "localhost";
		int port = 6666;
		Socket clientSocket = new Socket(host, port);
		System.out.println("Connected to Server");

		// Sending data from Client to Server
		BufferedReader keyboardInput = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter sendToServer = new PrintWriter(clientSocket.getOutputStream(), true);

		// Accepting response from server and Sending it to Client
		BufferedReader outFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

		while (true) {
			System.out.print("Enter a String:\t");
			String inpFromUser = keyboardInput.readLine(); // accepting input from keyboard
			sendToServer.println(inpFromUser); // sending the input to server

			if (inpFromUser.equals("exit")) {
				break;
			}

			String resFromServer = outFromServer.readLine(); // Response from Server
			System.out.println("SERVER: " + resFromServer); // Displaying the response from server to console
		}

		// Closing the clientSocket
		clientSocket.close();
	}
}
